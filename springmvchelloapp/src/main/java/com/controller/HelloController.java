package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
	@RequestMapping(value = "/hello")
	public String hello() {
		System.out.println("in hello controller class method");
		return "welcome";
	}

}
