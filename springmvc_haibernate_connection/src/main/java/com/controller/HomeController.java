package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.model.Student;
import com.servicei.HomeServiceI;


@Controller
public class HomeController {
	@Autowired
	HomeServiceI hsi;
	
@RequestMapping(value = "/")
	public String preLogin() {
	System.out.println("open login page");
		return "login";
	}

@RequestMapping(value = "/openregisterpage")
public String preRegister() {
	System.out.println("register login page");
	return "register";
	
}

@RequestMapping(value = "/save")
public String saveStudent(@ModelAttribute Student s) {
	hsi.saveStudent(s);
	return "login";
	
}

}
