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
	@RequestMapping(value = "/login")
	public String logincheck(@ModelAttribute User u,Model m)
	{
			List<User> users=new ArrayList<>();
			users.add(u);
			users.add(u);
			users.add(u);
			users.add(u);
			m.addAttribute("data", users);
		return "success";
		
	}
}
