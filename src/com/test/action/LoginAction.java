package com.test.action;

import com.opensymphony.xwork2.ActionSupport;
import com.test.dao.UserDAO;
import com.test.model.User;

public class LoginAction extends ActionSupport{
private UserDAO userDAO;
private User user;
public User getUser() {
	return user;
}
public void setUser(User user) {
	this.user = user;
}
public UserDAO getUserDAO() {
	return userDAO;
}
public void setUserDAO(UserDAO userDAO) {
	this.userDAO = userDAO;
}
public String execute(){
	if(userDAO.checkLogin(user)){
		return SUCCESS;
	}
	return ERROR;
}

}
