package com.szt.dao;

import com.szt.model.User;

public interface IUserDao extends ICommonDao<User>{
	
	  public final static String SERIVCE_NAME="com.szt.dao.impl.MyUserDaoImpl";
}
