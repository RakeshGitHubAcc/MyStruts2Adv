package com.test.dao;

import java.util.ArrayList;
import java.util.List;

import org.apache.struts2.ServletActionContext;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.test.listener.HibernateListener;
import com.test.model.Student;

public class StudentDAO {

	Session session;
	Transaction transaction;

	@SuppressWarnings("unchecked")
	public List<Student> getStudents() {

		List<Student> students = new ArrayList<Student>();
		try {
			// get hibernate session from the servlet context
			SessionFactory sessionFactory = (SessionFactory) ServletActionContext
					.getServletContext().getAttribute(
							HibernateListener.KEY_NAME);

			Session session = sessionFactory.openSession();
			students = session.createQuery("from Student").list();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (null != session) {
				session.close();
			}
		}
		return students;
	}

	public void addStudent(Student student) {
		try {
			// get hibernate session from the servlet context
			SessionFactory sessionFactory = (SessionFactory) ServletActionContext
					.getServletContext().getAttribute(
							HibernateListener.KEY_NAME);

			Session session = sessionFactory.openSession();
			session.beginTransaction();
			session.save(student);
			session.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (null != session) {
				session.close();
			}
		}

	}
}
