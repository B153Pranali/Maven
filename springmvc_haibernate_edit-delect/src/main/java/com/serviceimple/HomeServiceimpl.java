package com.serviceimple;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.daoi.HomeDaoI;
import com.model.Student;
import com.service.HomeServiceI;
@Service
public class HomeServiceimpl implements HomeServiceI {
	@Autowired
	HomeDaoI hdi;
	
	@Override
	public void saveStudent(Student s) {
	hdi.saveStudent(s);
		
	}

	@Override
	public List<Student> getStudents() {
		List<Student> list=hdi.getStudents();
		return list;
	}

	@Override
	public void delecteStudent(int rollno) {
		hdi.delecteStudent(rollno);
		
	}

	@Override
	public Student editStudent(int rollno) {
		return hdi.editStudent(rollno);
		
	}

	@Override
	public void updateStudent(Student s) {
	hdi.updateStudent(s);
		
	}

	@Override
	public List<Student> logincheck(String userName, String password) {
		// TODO Auto-generated method stub
		
		return hdi.logincheck(userName, password);
	}
}
