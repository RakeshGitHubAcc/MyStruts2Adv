package com.test.action;

import java.util.Date;

import com.opensymphony.xwork2.ActionSupport;

public class UpdateUserAction extends ActionSupport {
	public String execute(){
		System.out.println("Update Request Arrived to Action class.");
		setUpdateTime(new Date());
		return SUCCESS;
	}
	public void validate(){
		if(isEmpty(getName())){
		addActionError("Name can't be empty");
		}
		if(isEmpty(getAddress())){
			addActionError("Address cant be empty");
		}
	}
	private String name;
	private String address;
	private Date updateTime;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	private boolean isEmpty(String str) {
		return str == null ? true : (str.equals("") ? true : false);
	}
}
