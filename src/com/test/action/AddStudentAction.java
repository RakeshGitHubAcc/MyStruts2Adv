package com.test.action;

import java.util.List;

import org.apache.struts2.ServletActionContext;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.test.dao.StudentDAO;
import com.test.listener.HibernateListener;
import com.test.model.Student;

public class AddStudentAction extends ActionSupport implements
		ModelDriven<Student> {
	private Student student;
	private List<Student> students;
	private StudentDAO dao;

	@Override
	public Student getModel() {
		// TODO Auto-generated method stub
		return getStudent();
	}

	public String execute() {
		Session session = null;
		SessionFactory sessionFactory = null;
		try {
			// get hibernate session from the servlet context
			sessionFactory = (SessionFactory) ServletActionContext
					.getServletContext().getAttribute(
							HibernateListener.KEY_NAME);
			session = sessionFactory.openSession();
			getDao().addStudent(getStudent(), session);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (null != session) {
				session.close();
			}
		}

		return "success";
	}

	public String listStudents() {
		Session session = null;
		SessionFactory sessionFactory = null;
		try {
			// get hibernate session from the servlet context
			sessionFactory = (SessionFactory) ServletActionContext
					.getServletContext().getAttribute(
							HibernateListener.KEY_NAME);
			session = sessionFactory.openSession();
			setStudents(getDao().getStudents(session));
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (null != session) {
				session.close();
			}
		}
		return "success";
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

	public StudentDAO getDao() {
		return dao;
	}

	public void setDao(StudentDAO dao) {
		this.dao = dao;
	}

}
