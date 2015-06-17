package com.szt.dao.impl;

import javax.annotation.Resource;

import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.szt.dao.ICommonDao;

public class CommonDaoImpl<T> extends HibernateDaoSupport implements ICommonDao<T>{
	

	public void save(T entity) {
		this.getHibernateTemplate().save(entity);
		
	}
	
	
	@Resource(name="sessionFactory") // bean has create this sessionFactory instant
	public final void setSessionFactoryDi(SessionFactory sessionFactory){
		super.setSessionFactory(sessionFactory); 
	}
	

	public void update(T t) {
		
		
	}


	
	public void retrieve(T t) {
		// TODO Auto-generated method stub
		
	}


	
	
	
		
	
	
}
