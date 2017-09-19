package com.liu.ssm.controller;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import net.sf.json.JSONObject;

import org.apache.log4j.Logger;
import org.springframework.amqp.AmqpException;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.liu.other.util.GenerateKeyUtil;
import com.liu.ssm.pojo.Department;
import com.liu.ssm.service.DepartmentService;

@Controller("departmentController")
@RequestMapping("/department/")
public class DepartmentController {
	
	Logger logger = Logger.getLogger(DepartmentController.class);

	
	//@Autowired
	//private RabbitTemplate rabbitTemplate;
	
	private static final ObjectMapper OBJECT_MAPPER = new ObjectMapper();
	
	@Autowired
	private RedisTemplate<String, String> redisTemplate;
	
	@Autowired
	private DepartmentService departmentService;

	@RequestMapping("list")
	public ModelAndView list(){
		//rabbitMQ 生产者
		//Map<String, String> map = new HashMap<String, String>();
		//map.put("message", "This is department.list");
		/*try {
			rabbitTemplate.convertAndSend("department.list", OBJECT_MAPPER.writeValueAsString(map));
			rabbitTemplate.convertAndSend("department.list", "my name is liuweian");
		}  catch (Exception e) {
			e.printStackTrace();
		}*/
		return new ModelAndView("department/list");
	}
	
	/**
	 * 
	 * @author LWA
	 * @description 部门初始化数据
	 * @data 2017-8-1 下午7:24:10
	 * @param request
	 * @return
	 */
	@RequestMapping("intiData")
	@ResponseBody
	public JSONObject intiData(HttpServletRequest request){
		String departmentName = request.getParameter("departmentName");
		String correntPage = request.getParameter("correntPage");
		
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("pageSize", 10);
		jsonObject.put("count", departmentService.totalNumber(departmentName));
		jsonObject.put("departments", departmentService.getPage(departmentName,
				correntPage != null ? Integer.parseInt(correntPage) : 1, 10));
		return jsonObject;
	}
	
	/**
	 * 
	 * @author LWA
	 * @description 编辑页面,可以尝试封装一下
	 * @data 2017-8-1 下午8:40:21
	 * @param id
	 * @return
	 */
	@RequestMapping("edit")
	@Transactional
	public ModelAndView edit(@RequestParam("id")String id){
		ModelAndView mv = new ModelAndView("department/edit");
		mv.addObject("department",departmentService.getById(id));
		return mv;
	}
	
	
	/**
	 * 
	 * @author LWA
	 * @description 删除数据
	 * @data 2017-7-20 下午7:52:47
	 * @param id
	 * @return	
	 */
	@RequestMapping("delete")
	@ResponseBody
	public Map<String,Object> delete(@RequestParam("id")String id){
		Map<String,Object> map = new HashMap<String,Object>();
		departmentService.delete(id);
		map.put("message","success");
		return map;
	}
	
	/**
	 * 
	 * @author LWA
	 * @description 到添加页面
	 * @data 2017-7-26 下午11:09:41
	 * @return
	 */
	@RequestMapping("add")
	public ModelAndView add(){
		return new ModelAndView("/department/edit");
	}
	
	/**
	 * 
	 * @author LWA
	 * @description 保存数据可以更新可以添加
	 * @data 2017-7-26 下午10:18:26
	 * @param request
	 * @return
	 */
	@RequestMapping("save")
	@ResponseBody
	public Map<String,Object> save(HttpServletRequest request) throws Exception {
		Map<String,Object> map = new HashMap<String,Object>();
		Department department =  null;
		
		String departmentNo = request.getParameter("departmentNo");
		String departmentName = request.getParameter("departmentName");
		String SupervisorNo = request.getParameter("supervisorNo");
		/*int departmentNumber = Integer.parseInt(request.getParameter("departmentNumber"));*/
		String description = request.getParameter("description");
		String higherOfficeNo = request.getParameter("higherOfficeNo");
		
		List<Department> list = new ArrayList<Department>();
		list = departmentService.getDepartmentByName(departmentNo);
		
		if (departmentNo == null || departmentNo == "") {
			if (list.size() > 0) {
				map.put("message","该部门已经存在！");
				return map;
			}
			//this is add order
			department = new Department();
			department.setDepartmentNo(GenerateKeyUtil.GenerateByDate());
			department.setDepartmentName(departmentName);
			department.setSupervisorNo(SupervisorNo);
			department.setDescription(description);
			//缺少一个人数的字段
			department.setHigherOfficeNo(higherOfficeNo);
			departmentService.add(department);
			
			map.put("message","添加成功！确定跳转到列表页面，取消留在编辑页面！");
		} else {
			if (list.size() > 1) {
				map.put("message","该部门已经存在！确定跳转到列表页面，取消留在编辑页面！");
				return map;
			}
			//this is update order
			department = departmentService.getById(departmentNo);
			department.setDepartmentName(departmentName);
			department.setSupervisorNo(SupervisorNo);
			department.setDescription(description);
			department.setHigherOfficeNo(higherOfficeNo);
			
			departmentService.update(department);
			map.put("message","修改成功！确定跳转到列表页面，取消留在编辑页面！");
		}
		return map;
	}
	
	
	/**
	 * 
	 * @author LWA
	 * @description 查看页面
	 * @data 2017-7-26 下午11:16:47
	 * @param id
	 * @return
	 */
	@RequestMapping("show")
	public ModelAndView show(@RequestParam("id") String id){
		ModelAndView mv = new ModelAndView("employee/list");
		if (id != null) {
			mv.addObject("departmentNo",departmentService.getById(id).getDepartmentNo());
		}
		
		String redString =  (String) redisTemplate.opsForHash().get("FF", "FF");
		logger.debug("++++++++++++++++++++++++++++++++++++++++++++++++"  + redString + "+++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("==========================================" + redisTemplate.opsForValue().get("liuweianw") + "===========================================");
		
		return mv;
	}
	
	/**
	 * 
	 * @author LWA
	 * @Descrition 跳转到部门员工信息页面
	 * @date 2017-8-4 上午11:33:08
	 * @return
	 */
	@RequestMapping("showPeople")
	public ModelAndView showPeople(@RequestParam("departmentNo")String departmentNo){
		ModelAndView mv = new ModelAndView("employee/list");
		mv.addObject("departmentNo", departmentNo);
		return mv;
	}
	
}
