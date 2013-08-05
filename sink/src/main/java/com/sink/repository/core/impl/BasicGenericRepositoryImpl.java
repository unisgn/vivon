package com.sink.repository.core.impl;



import java.lang.reflect.ParameterizedType;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sink.repository.core.BasicGenericRepository;

@Repository
public class BasicGenericRepositoryImpl<T> implements BasicGenericRepository<T> {


	private Class<T> type;
	
	@Autowired
	private SessionFactory sessionFactory;
	
	
	public Session getSession() {
		return sessionFactory.getCurrentSession();
	}
	

	public Class<T> getType() {
		return type;
	}

	@SuppressWarnings("unchecked")
	public BasicGenericRepositoryImpl() {
		this.type = (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
	}
	
	
	
	
	@SuppressWarnings("unchecked")
	public T find(int id) {
		return (T) getSession().get(getType(), id);
	}
	

	public int create(T entity) {
		return (Integer) getSession().save(entity);
	}
	public void update(T entity) {
		getSession().update(entity);
	}

	public void delete(T entity) {
		getSession().delete(entity);
	}
	

}
