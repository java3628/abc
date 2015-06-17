package com.szt.dao.impl;

import com.szt.dao.UserDAO;
import com.szt.model.User;

public class UserDAOImpl implements UserDAO {
	@Override
	public void save(User user) {
		
		System.out.println("user saved!!!!");
		
		System.out.println("get from user"+user.getAge());
		
		
	}

	@Override
	public void retrive(User user) {
		
	}

	
	

}
