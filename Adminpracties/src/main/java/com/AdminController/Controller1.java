package com.AdminController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Controller1 {

		@RequestMapping(value = "/adminstudent")
		public String adminstudent() {
		
			return "studentReg";
		}
		
		@RequestMapping(value = "/adminteacher")
		public String adminteacher() {
		
			return "teacherReg";
		}
		
		@RequestMapping(value = "/suc")
		public String success1() {
		
			return "success";
		}
		
		@RequestMapping(value = "/sucess")
		public String success2() {
		
			return "success";
		}
}
