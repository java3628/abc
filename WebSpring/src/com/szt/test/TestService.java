package com.szt.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.util.Date;
import com.szt.dao.IUserDao;
import com.szt.model.User;
import com.szt.service.IUserService;

public class TestService {

	@Test
	public void save(User u){
		
		  
		
		
		ApplicationContext ac=new ClassPathXmlApplicationContext("com/szt/beans/MyBean.xml");
		
		IUserService service=(IUserService) ac.getBean(IUserService.SERVICE_NAME);
		
		
		Date t = new Date();
		System.out.println("time:"+t);
		
		
		User uu=new User();
		uu.setName("Service  Test");
		uu.setAge(25);
		uu.setDate(t);
		
		service.saveUser(u);	
	}
	
	
	

}
