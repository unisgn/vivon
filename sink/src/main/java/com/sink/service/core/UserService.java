package com.sink.service.core;

import com.sink.domain.core.User;

public interface UserService {
	
	public User findUserById(int id);
	public User findUserByName(String name);
	
    public List<User> findAllUsers();
    
	public int addUser(User user);
	public void updateUser(User user);
	public void toggleOfUser(int id);
    
}
