package com.sink.domain.core;

import javax.persistence.*;

@Entity
@Table
public class Tag extends EntityBase {
	
	private String name;
	
	public Tag() {}
	public Tag(String name) { this.name = name; }
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
