package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class AdminController {

			@RequestMapping(value = "/adminstudent")
			public String adminstudent() {
			
				return "student";
			}
			
			@RequestMapping(value = "/adminteacher")
			public String adminteacher() {
			
				return "teacher";
			}
			
			@RequestMapping(value = "/suc")
			public String student(@ModelAttribute Student s) {
			System.out.println(s.getFirstName());
			System.out.println(s.getLastName());
			System.out.println(s.getGender());
			System.out.println(s.getMobile());
			System.out.println(s.getAddress());
			System.out.println(s.getPassword());
				return "success";
			}
			
			@RequestMapping(value = "/sucess")
			public String teacher(@ModelAttribute Teacher t) {
			System.out.println(t.getFirstName());
			System.out.println(t.getLastName());
			System.out.println(t.getEmail());
			System.out.println(t.getDateOfBirth());
				return "success";
			}
	}

