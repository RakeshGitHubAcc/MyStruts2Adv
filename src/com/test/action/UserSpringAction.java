package com.test.action;

import com.test.bo.UserBo;

public class UserSpringAction {
//Dependency Injection via Spring
	UserBo userBo;

	public UserBo getUserBo() {
		return userBo;
	}

	public void setUserBo(UserBo userBo) {
		this.userBo = userBo;
	}
	
	public String execute()throws Exception{
		userBo.printUser();
		return "success";
	}
}
