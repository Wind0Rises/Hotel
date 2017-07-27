package com.liu.ssm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping("/sysuser/")
public class SysUserController {

	@RequestMapping("mainPage")
	public ModelAndView mainPage(){
		return new ModelAndView("/sysuser/mainPage");
	}
}
