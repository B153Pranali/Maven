package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
	@RequestMapping(value = "/login")
public String logincheck(@RequestParam("username") String u,@RequestParam("password") String p,ModelMap m) 
	{
		m.addAttribute("username", u);
		m.addAttribute("password", p);
	return "success";
	
}
}
