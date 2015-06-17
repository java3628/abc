package com.szt.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.szt.dao.IUserDao;
import com.szt.model.User;
import com.szt.service.IUserService;


@Transactional(readOnly=true)  // class level readOnly
@Service(IUserService.SERVICE_NAME)
public class MyUserServiceImpl implements IUserService {

	@Resource(name=IUserDao.SERIVCE_NAME)
	private IUserDao iUserDao;

	@Transactional(readOnly=false,isolation=Isolation.DEFAULT,
			propagation=Propagation.REQUIRED)
	public void saveUser(User user) {
		iUserDao.save(user);
		
	}

	
	public void retrieveUser(User user) {
		iUserDao.retrieve(user);
	}
	
}
