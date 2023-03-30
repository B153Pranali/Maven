package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Homecontroller {
	@RequestMapping(value = "/login")
public String logincheck(@RequestParam("username") String u,@RequestParam("password") String p,Model m) {
	m.addAttribute("username", u);
	m.addAttribute("password", p);
		return "success";
	
}
}
