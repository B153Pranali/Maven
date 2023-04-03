package com.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Homecontroller {
	@RequestMapping(value = "/login")
public String logincheck(@RequestParam("username") String u,@RequestParam("password") String p,Model m)
{
		List<String> names=new ArrayList<>();
		names.add(u);
		names.add(p);
		m.addAttribute("name", names);
	
	return "seccess";
	
}
}
