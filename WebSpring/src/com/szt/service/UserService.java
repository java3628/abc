package com.szt.service;

import com.szt.dao.UserDAO;
import com.szt.dao.impl.UserDAOImpl;
import com.szt.model.User;



public class UserService {
	private UserDAO userDAO=new UserDAOImpl();  
	
	
	public void add(User user) {
		userDAO.save(user);
	}
	
	
	public UserDAO getUserDAO() {
		return userDAO;
	}
	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}
}
