package com.liu.ssm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("post")
public class PostController {

	@RequestMapping("list")
	public ModelAndView list(){
		return new ModelAndView("post/list");
	}
}
