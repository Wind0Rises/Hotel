package com.liu.ssm.controller;


import java.io.File;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import net.sf.json.JSONObject;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.liu.other.util.GenerateKeyUtil;
import com.liu.other.util.UploadUtil;
import com.liu.ssm.pojo.Employee;
import com.liu.ssm.service.EmployeeService;


@Controller
@RequestMapping("/employee/")
public class EmployeeController {
	
	Logger logger = Logger.getLogger(EmployeeController.class);

	@Autowired
	private EmployeeService employeeService;

	@RequestMapping("list")
	public ModelAndView list(){
		return new ModelAndView("employee/list");
	}
	
	/**
	 * 
	 * @author LWA
	 * @description 初始化数据
	 * @data 2017-8-1 下午7:24:10
	 * @param request
	 * @return
	 */
	@RequestMapping("intiData")
	@ResponseBody
	public JSONObject intiData(HttpServletRequest request){
		String employeeName = request.getParameter("employeeName");
		String date = request.getParameter("date");
		String correntPage = request.getParameter("correntPage");
		
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("pageSize", 10);
		jsonObject.put("count", employeeService.totalNumber(employeeName, date));
		jsonObject.put("employees", employeeService.getPage(employeeName,date,
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
	public ModelAndView edit(@RequestParam("id")String id){
		ModelAndView mv = new ModelAndView("employee/edit");
		mv.addObject("employee",employeeService.getById(id));
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
		try {
			employeeService.delete(id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		map.put("message","删除成功");
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
		Employee employee = null;
		
		String id = request.getParameter("id");
		String employeeName = request.getParameter("employeeName");
		int age = Integer.parseInt(request.getParameter("age"));
		String date = request.getParameter("date");
		String images = request.getParameter("images");
		int status = Integer.parseInt(request.getParameter("status"));
		double salary = Double.parseDouble(request.getParameter("salary"));
		double reward = Double.parseDouble(request.getParameter("reward"));
		String departmentNo = request.getParameter("departmentNo");
		String postNo = request.getParameter("postNo");
		String description = request.getParameter("description");
		
		if (id == null) {
			//this is add
			employee = new Employee();
			employee.setId(GenerateKeyUtil.GenerateByDate());
		}else {
			//this is update 
			employee = employeeService.getById(id);
		}
		
		employee.setEmployeeName(employeeName);
		employee.setAge(age);
		employee.setDate(date);
		employee.setImages(images);
		employee.setStatus(status);
		employee.setSalary(salary);
		employee.setReward(reward);
		employee.setDepartmentNo(departmentNo);
		employee.setPostNo(postNo);
		employee.setDescription(description);
		
		if (id == null) {
			//this is add
			employeeService.add(employee);
			map.put("message", "添加成功！确定跳转到列表页面，取消留在编辑页面！");
		}else {
			//this is update 
			employeeService.update(employee);
			map.put("message", "修改成功！确定跳转到列表页面，取消留在编辑页面！");
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
		ModelAndView mv = new ModelAndView("department/show");
		if (id != null) {
			mv.addObject("department",employeeService.getById(id));
		}
		return mv;
	}
	
	
	@RequestMapping("upload")
	@ResponseBody
	public Map<String, Object> uploadImage(@RequestParam("file")MultipartFile multipartFile,HttpSession session) throws Exception{
		
		Map<String, Object> map = new HashMap<String,Object>();
		
		String url = session.getServletContext().getRealPath(UploadUtil.URL);
		
		String fileName = multipartFile.getOriginalFilename();
		
		UploadUtil.uploadInputStream(multipartFile, url, fileName);
		
		map.put("message", "上传成功");
		
		return map;
	}
	
	
	
	
	
	
	
	
	
	
	
}
