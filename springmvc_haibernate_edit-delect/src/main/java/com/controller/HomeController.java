package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.model.Student;
import com.service.HomeServiceI;

@Controller
public class HomeController {
	
	@Autowired
	HomeServiceI hsi;
	
@RequestMapping(value = "/")
	public String prelogin() {
		return "login";
		
	}

@RequestMapping(value = "/openregisterpage")
public String register() {
	return "register";
	
}
@RequestMapping(value = "/save")
public String login(@ModelAttribute Student s) {
hsi.saveStudent(s);
	return "login";
}

@RequestMapping(value = "/login")
public String logincheck(@RequestParam String username,@RequestParam String password,Model m) {
	if(username.equals("ADMIN")&& password.equals("ADMIN")) {
		List<Student> list=hsi.getStudents();
		m.addAttribute("data",list);
				return "success";
	}
	else {
		List<Student> list=hsi.logincheck(username, password);
		if(list.isEmpty()) {
			m.addAttribute("data",list);
			return "success";
		}
	else {
	return "login";
	}
	}
}
@RequestMapping(value = "/delete")
public String delectStudent(@RequestParam int rollno,Model m) {
	hsi.delecteStudent(rollno);
	List<Student> list=hsi.getStudents();
	m.addAttribute("data",list);
	return "success";
	
}

@RequestMapping(value = "/edit")
public String editStudent(@RequestParam int rollno,Model m) {
	Student s=hsi.editStudent(rollno);
	m.addAttribute("s",s);
	return "edit";
	
}

@RequestMapping(value = "/update")
public String updateStudent(@ModelAttribute Student s,Model m) {
	hsi.updateStudent(s);
	List<Student> list=hsi.getStudents();
	m.addAttribute("data",list);
	return "success";
	
}
}
