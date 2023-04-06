package com.daoimple;

import java.util.List;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.daoi.HomeDaoI;
import com.model.Student;
@Repository
public class HomeDaoImple implements HomeDaoI{
	@Autowired
	SessionFactory sf;
	
	@Override
	public void saveStudent(Student s) {

			Session session=sf.openSession();
			session.save(s);
			session.beginTransaction().commit();
			
		
	}

	@Override
	public List<Student> getStudents() {
		Session session=sf.openSession();
		
		return session.createQuery("from Student").getResultList();
	}

	@Override
	public void delecteStudent(int rollno) {
		Session session=sf.openSession();
		
		Query<Student> query=session.createQuery("delect from Student where rollNo=?");
		query.setParameter(0, rollno);
		Transaction tx=session.beginTransaction();
		query.executeUpdate();
		tx.commit();
	}

	@Override
	public Student editStudent(int rollno) {
		System.out.println(rollno);
		Session session=sf.openSession();
		Student s=session.get(Student.class, rollno);
		System.out.println(s.getRollNo());
		return s;
		
	}

	@Override
	public void updateStudent(Student s) {
	Session session=sf.openSession();
	session.update(s);
	session.beginTransaction().commit();
		
	}

	@Override
	public List<Student> logincheck(String userName, String password) {
		// TODO Auto-generated method stub
		Session session=sf.openSession();
		Query<Student> query=session.createQuery("from Student where userName=? and password=?");
		query.setParameter(0, userName);
		query.setParameter(1, password);
		return query.getResultList();
	}
	
	}

