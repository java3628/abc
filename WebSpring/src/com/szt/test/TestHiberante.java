package com.szt.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.szt.dao.IUserDao;
import com.szt.model.User;
import com.szt.service.UserService;

public class TestHiberante {
	
	private static SessionFactory sessionFactory;
	
	public static int age=12; 

	@Test
	public void testUser(){
		 
		sessionFactory = new Configuration().configure().buildSessionFactory();
		
		Session session= sessionFactory.getCurrentSession();
		session.beginTransaction();
		
				
		System.out.println(age);
		age=age+1;
		System.out.println("after"+age);
		
		User u = new User();
		u.setAge(age);
		u.setName("HiberanteTest");
		
		session.save(u);
		
		
		
		System.out.println(u.getAge()+"      "+u.getName());
		
		}
		
		@Test
		public void saveUser(){
			
			  
			
			ApplicationContext ac=new ClassPathXmlApplicationContext("com/szt/beans/MyBean.xml");
			
			IUserDao iUserDao=(IUserDao) ac.getBean("com.szt.dao.impl.MyUserDaoImpl");
			
			//���������User ������
			User u=new User();
			u.setName("DAO  Test  ");
			u.setAge(25);
			
			iUserDao.save(u);
			
		}
	

}
