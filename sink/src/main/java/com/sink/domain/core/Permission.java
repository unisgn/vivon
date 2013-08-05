package com.sink.domain.core;


import javax.persistence.*;


@Entity
@Table
public class Permission extends EntityBase {

	private String name;
	
	public Permission() {}
	public Permission(String name) { this.name = name; }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
