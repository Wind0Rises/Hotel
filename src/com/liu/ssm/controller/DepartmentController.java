package com.liu.ssm.controller;


import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.liu.ssm.service.DepartmentService;

@Controller
@RequestMapping("/department/")
public class DepartmentController {
	
	Logger logger = Logger.getLogger(DepartmentController.class);

	@Autowired
	private DepartmentService departmentService;

	@RequestMapping("list")
	public ModelAndView list(){
		return new ModelAndView("department/list");
	}
	
	
}
