package com.sink.repository.core.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.sink.repository.core.AdvancedGenericRepository;
import com.sink.repository.core.impl.BasicGenericRepositoryImpl;

@Repository
public class AdvancedGenericRepositoryImpl<T> extends BasicGenericRepositoryImpl<T> implements AdvancedGenericRepository<T>  {

	@SuppressWarnings("unchecked")
	public List<T> getAll() {
		return getSession().createQuery("SELECT c FROM " + getType().getName() + " c ").list();
	
	}
	
	public int getTotalCount() {
		Number c = (Number) getSession().createQuery("SELECT COUNT(c) FROM " + getType().getName() + " c ").uniqueResult();
		return c.intValue();
	}
	
}
