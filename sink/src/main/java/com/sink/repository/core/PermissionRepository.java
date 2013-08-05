package com.sink.repository.core;

import java.util.List;

import com.sink.domain.core.Permission;

public interface PermissionRepository {
	public List<Permission> getAll();
}
