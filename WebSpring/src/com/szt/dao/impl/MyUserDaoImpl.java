package com.szt.dao.impl;



import org.springframework.stereotype.Repository;

import com.szt.dao.IUserDao;
import com.szt.model.User;


@Repository(IUserDao.SERIVCE_NAME)
public class MyUserDaoImpl extends CommonDaoImpl <User>implements IUserDao  {
	
		
}
