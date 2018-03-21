package com.spring.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Controller
public class MainController {

	@RequestMapping("/main")
	public ModelAndView goToMain(){
		System.out.println("in -->goToMain()<--");
		return new ModelAndView("main");
	}
}
