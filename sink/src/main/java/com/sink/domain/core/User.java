package com.sink.domain.core;

import javax.persistence.*;

import com.sink.lib.core.BuildInUser;


/**
 * !!important: for some particular reason, there are some build in users, see {@link BuildInUser};
 * @author root
 *
 */
@Entity
@Table
public class User extends EntityBase {

	private String username;
	private String password;
	
	private DroidAssistant assistant;
    
	public User() {}
	
	public User(String name, String pw) {
		this.username = name;
		this.password = pw;
	}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	public DroidAssistant getAssistant() {
		return assistant;
	}

	public void setAssistant(DroidAssistant assistant) {
		this.assistant = assistant;
	}
	
	
	
	
}
