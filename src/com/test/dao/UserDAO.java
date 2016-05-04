package com.test.dao;

import com.test.model.User;

public class UserDAO {
	public boolean checkLogin(User user) {
        return user.getUserName().equals("admin")
                && user.getPassword().equals("nimda");
    }
}
