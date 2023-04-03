package com.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
	
	List<User> users=new ArrayList<>();
	
	//@RequestMapping(value = "/login")
	//public String loginCheck() {
	
		//return "success";
	//}

	@RequestMapping(value = "/regisation")
	public String regisation() {
	
		return "regisation";
	}
	
	@RequestMapping(value = "/login")
	public String logincheck1(@RequestParam String u,@RequestParam String p,Model m)
	{
		for(User user :users) {
			if(user.getUsername().equals(u)&&user.getPassword().equals(p)) {
			m.addAttribute("u", user);
			return "success";
			}
		}
		return "npf";
	}

	@RequestMapping(value = "/registor")
	public String logincheck(@ModelAttribute User u,Model m)
	{
		users.add(u);
	
			m.addAttribute("data", u);
		return "login";
		
	}
}