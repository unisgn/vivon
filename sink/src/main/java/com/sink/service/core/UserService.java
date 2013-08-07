package com.sink.service.core;

import com.sink.domain.core.User;

public interface UserService {
	
	public User findUserById(int id);
	public User findUserByName(String name);
	
	public int addUser();
	public void updateUser(User user);
	
}
