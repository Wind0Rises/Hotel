package com.liu.ssm.controller;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.portlet.ModelAndView;

import com.liu.other.exception.CustomException;
import com.liu.ssm.pojo.Student;
import com.liu.ssm.service.StudentService;

@Controller
@RequestMapping("/student/")
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	@RequestMapping("list")
	@RequiresPermissions("student:list")
	public ModelAndView studentList() throws Exception{
		Student student = studentService.getStudentById(1);
		if (student ==  null) {
			throw new CustomException("学生为空");
		}
		return new ModelAndView("list");
	}
	
	@RequestMapping("anonStudent")
	public ModelAndView anonStudent() throws Exception{
		return new ModelAndView("anonStudent");
	}
	
}
