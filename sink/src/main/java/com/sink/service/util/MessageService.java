package com.sink.service.core;

import java.util.Set;

import com.sink.domain.core.Message;
import com.sink.domain.core.User;

public interface MessageService {

	public Message getMessage(int id);
	

	public int draftMessage(Message message, User composer);
	public void sendMessage(Message message, User sender, Set<User> receivers);
	

}

