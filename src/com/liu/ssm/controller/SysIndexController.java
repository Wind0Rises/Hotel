package com.liu.ssm.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.portlet.ModelAndView;

import com.liu.other.exception.CustomException;

@Controller
public class SysIndexController {
	
	@RequestMapping("login")
	public String login(HttpServletRequest request) throws Exception{
		String exceptionClassName = (String) request.getAttribute("shiroLoginFailure");
		if (exceptionClassName != null) {
			if (UnknownAccountException.class.getName().equals(exceptionClassName)) {
				throw new CustomException("账号不存在!");
			} else if (IncorrectCredentialsException.class.getName().equals(exceptionClassName)) {
				throw new CustomException("用户名/密码错误!");
			} else {
				throw new Exception();
			}
		}
		return "login";
	}
	
	
	@RequestMapping("/index")
	public ModelAndView index(){
		return new ModelAndView("index");
	}
	
	
	@RequestMapping("/refuse")
	public ModelAndView refuse(){
		return new ModelAndView("refuse");
	}
}
