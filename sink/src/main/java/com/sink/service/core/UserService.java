package com.sink.service.core;

import org.springframework.security.access.prepost.PreAuthorize;

import com.sink.domain.core.User;

public interface UserService {
	
	public User findUserById(int id);
	public User findUserByName(String name);
	
	public int addUser();
	public void updateUser(User user);
	
}
