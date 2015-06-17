package com.szt.service;

import com.szt.model.User;

public interface IUserService {
	public final static String SERVICE_NAME="com.szt.service.impl.MyUserServiceImpl";
	
	public void saveUser(User user);
	
	public void retrieveUser(User user);
}
