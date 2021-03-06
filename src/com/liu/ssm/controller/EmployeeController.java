package com.liu.ssm.controller;


import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import net.sf.json.JSONObject;

import org.apache.log4j.Logger;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.liu.other.util.GenerateKeyUtil;
import com.liu.other.util.UploadAndDownloadUtil;
import com.liu.ssm.pojo.Employee;
import com.liu.ssm.service.EmployeeService;


@Controller
@RequestMapping("/employee/")
public class EmployeeController {
	
	Logger logger = Logger.getLogger(EmployeeController.class);

	@Autowired
	private EmployeeService employeeService;
	
	@Autowired
	private RedisTemplate redisTemplate;
	
	/*@Autowired
	private RabbitTemplate rabbitTemplate;*/

	@RequestMapping("list")
	public ModelAndView list(){
		
		//rabbitTemplate.convertAndSend("employee.add", "This is employee.add!");
		
		
		ValueOperations<String, String> operations = redisTemplate.opsForValue();
		operations.set("zheshi", "asdfa");
		
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
		return new ModelAndView("/employee/edit");
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
		String phone = request.getParameter("phone");
		String email = request.getParameter("email");
		int status = Integer.parseInt(request.getParameter("status"));
		double salary = Double.parseDouble(request.getParameter("salary"));
		double reward = Double.parseDouble(request.getParameter("reward"));
		String departmentNo = request.getParameter("departmentNo");
		String postNo = request.getParameter("postNo");
		String description = request.getParameter("description");
		
		if (id == null || id.isEmpty()) {
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
		employee.setStatus(status);
		employee.setSalary(salary);
		employee.setReward(reward);
		employee.setDepartmentNo(departmentNo);
		employee.setPostNo(postNo);
		employee.setDescription(description);
		employee.setEmail(email);
		employee.setPhone(phone);
		
		if (id == null || id.isEmpty()) {
			//this is add
			String images = request.getParameter("images");
			employee.setImages(images);
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
		ModelAndView mv = new ModelAndView("employee/show");
		if (id != null) {
			mv.addObject("employee",employeeService.getById(id));
		}
		return mv;
	}
	
	/**
	 * 
	 * @author LWA
	 * @Descrition 上传图片 并返回相应的文件名
	 * @date 2017-8-3 上午11:15:25
	 * @param multipartFile
	 * @param session
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("upload")
	@ResponseBody
	public Map<String, Object> uploadImage(@RequestParam("file")MultipartFile multipartFile,HttpSession session,
			HttpServletRequest request) throws Exception{
		Map<String, Object> map = new HashMap<String,Object>();
		
		String id = request.getParameter("id");
		if (id != null && !(id.isEmpty())) {
			Employee employee = employeeService.getById(id);
			String images = employee.getImages();
			String[] imagesArray = images.split(",");
			if (imagesArray.length >= 3) {
				map.put("message", "您已经上传三张图片了！不能在上传了");
				return map;
			}
			//上传操作
			String url = session.getServletContext().getRealPath(UploadAndDownloadUtil.URL);
			String fileName = multipartFile.getOriginalFilename();
			String newFileName = UploadAndDownloadUtil.uploadInputStream(multipartFile, url, fileName);
			if (images == null || images.isEmpty()) {
				images += newFileName;
			}else {
				images += "," + newFileName;
			}
			employee.setImages(images);
			employeeService.update(employee);
			map.put("fileName", newFileName);
		}else{
			//上传操作
			String url = session.getServletContext().getRealPath(UploadAndDownloadUtil.URL);
			String fileName = multipartFile.getOriginalFilename();
			String newFileName = UploadAndDownloadUtil.uploadInputStream(multipartFile, url, fileName);
			map.put("fileName", newFileName);
		}
		
		map.put("message", "上传成功");
		return map;
	}
	
	/**
	 * 
	 * @author LWA
	 * @Descrition 删除图片,前台已经删除成功后，进行数据库删除
	 * @date 2017-8-3 下午4:24:40
	 * @param request
	 * @param session
	 * @return
	 */
	@RequestMapping("deleteImage")
	@ResponseBody
	public Map<String, Object> deleteImage(HttpServletRequest request,HttpSession session){
		Map<String, Object> map = new HashMap<String,Object>();
		String id = request.getParameter("id");
		String fileName = request.getParameter("fileName");
		String url = session.getServletContext().getRealPath(UploadAndDownloadUtil.URL);
		
		Employee employee = employeeService.getById(id);
		String images = employee.getImages();
		if (images == null || images.isEmpty()) {
			map.put("message", "没有资源可以删除！");
		}
		String[] imagesArray = images.split(",");
		String newImages = "";
		for (String item : imagesArray) {
			if (item.equals(fileName)) continue; 
			newImages += item + ",";
		}
		if (newImages != "") {
			newImages = newImages.substring(0, newImages.length() - 1);
		}
		employee.setImages(newImages);
		employeeService.update(employee);
		
		
		map.put("message", UploadAndDownloadUtil.delete(url, fileName));
		return map;
	}
	
	/**
	 * 
	 * @author LWA
	 * @Descrition 到人员分布的图标页面
	 * @date 2017-8-9 上午10:30:47
	 * @return
	 */
	@RequestMapping("distribute")
	public ModelAndView distribute(){
		return new ModelAndView("employee/distribute");
	}
	
	/**
	 * 
	 * @author LWA echart 图标
	 * @Descrition
	 * @date 2017-8-11 上午9:22:59
	 * @return
	 */
	@RequestMapping("distributeInit")
	@ResponseBody
	public JSONObject distributeInit(){
		System.out.println("jiandf");
		List<Map<String, Integer>> map = employeeService.distributed();
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("data", map);
		return jsonObject;
	}
	
	/**
	 * 
	 * @author LWA
	 * @Descrition 邮件发送页面
	 * @date 2017-8-11 上午9:17:45
	 * @return
	 */
	@RequestMapping("sendMail")
	public ModelAndView sendMail(@RequestParam("email")String email){
		ModelAndView mv = new ModelAndView("employee/sendMail");
		mv.addObject("email",email);
		return mv;
	}
	
	
}
