package com.sink.security;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;


@Repository
public class PermissionRepositoryImpl implements PermissionRepository {
    
    @Resource
    SessionFactory sessionFactory;
    
    @SuppressWarnings("unchecked")
    public List<Permission> getAll() {
        return sessionFactory.getCurrentSession().createQuery("SELECT c FROM Permission c").list();
    }
}
