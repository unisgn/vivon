package com.sink.service.core.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sink.domain.core.Permission;
import com.sink.repository.core.PermissionRepository;
import com.sink.service.core.PermissionService;

@Service
@Transactional
public class PermissionServiceImp implements PermissionService {
	
	@Autowired
	PermissionRepository pr;
	public List<Permission> getAll() {
		return pr.getAll();
	}
}
