package com.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.model.Student;

@Configuration
public class AppConfig {
	
	@Bean
public Student s() {
	return new Student();
	
}
}
