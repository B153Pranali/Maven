package com.service;

import java.util.List;

import com.model.Student;

public interface HomeServiceI {
	public void saveStudent(Student s);
	public List<Student> getStudents();
	public void delecteStudent(int rollno);
	public Student editStudent(int rollno);
	public void updateStudent(Student s);
	public List<Student> logincheck(String userName,String password);
}
