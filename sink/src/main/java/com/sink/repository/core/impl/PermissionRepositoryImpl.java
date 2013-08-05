package com.sink.repository.core.impl;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.sink.domain.core.Permission;
import com.sink.repository.core.PermissionRepository;

@Repository
public class PermissionRepositoryImpl implements PermissionRepository {
	
	@Resource
	SessionFactory sessionFactory;
	
	@SuppressWarnings("unchecked")
	public List<Permission> getAll() {
		return sessionFactory.getCurrentSession().createQuery("SELECT c FROM Permission c").list();
	}
}
