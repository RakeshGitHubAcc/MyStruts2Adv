package com.test.dao;

import java.util.List;

import org.hibernate.Session;

import com.test.model.Student;

public class StudentDAO {

	@SuppressWarnings("unchecked")
	public List<Student> getStudents(Session session) {
		List<Student> students = session.createQuery("from Student").list();
		return students;
	}

	public void addStudent(Student student, Session session) {
			session.beginTransaction();
			session.save(student);
			session.getTransaction().commit();
	}
}
