package com.sink.service.core;

public interface MessageService {

	public Message getMessage(int id);
	

	public int draftMessage(Message message, User composer);
	public void sendMessage(Message message, User sender, Set<User> receivers);
	

}

