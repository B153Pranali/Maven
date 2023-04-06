package com.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.HomeDao;
import com.model.Student;
import com.servicei.HomeServiceI;
@Service
public class HomeServiceImpl implements HomeServiceI {

	@Autowired
	HomeDao hdi;
	
	@Override
	public void saveStudent(Student s) {
	hdi.saveStudent(s);
		
	}

}
