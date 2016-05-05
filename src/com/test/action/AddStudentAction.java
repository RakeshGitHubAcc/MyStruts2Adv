package com.test.action;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.test.dao.StudentDAO;
import com.test.model.Student;

public class AddStudentAction extends ActionSupport implements
		ModelDriven<Student> {
	private Student student = new Student();
	private List<Student> students = new ArrayList<Student>();
	StudentDAO dao = new StudentDAO();

	@Override
	public Student getModel() {
		// TODO Auto-generated method stub
		return getStudent();
	}

	public String execute() {
		dao.addStudent(getStudent());
		return "success";
	}

	public String listStudents() {
		setStudents(dao.getStudents());
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

}
