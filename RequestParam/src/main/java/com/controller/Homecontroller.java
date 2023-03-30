package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Homecontroller {
	//@RequestMapping(value = "/login")
	//public String name1(String username,String password) {
	//System.out.println(username);
	//System.out.println(password);
		//return "sucess";
		
	
	@RequestMapping(value = "/login")
	public String name1(@RequestParam ("username") String u,
			@RequestParam ("password") String p) {
	System.out.println(u);
	System.out.println(p);
		return "sucess";
	
	}
}
