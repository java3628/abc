package com.szt.dao;

public interface ICommonDao<T> {
	public void save(T entity);
	
	public void update(T t);
	
	public void retrieve(T t);
}
