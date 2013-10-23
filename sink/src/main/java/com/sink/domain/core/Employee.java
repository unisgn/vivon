package com.sink.domain.core;

import java.util.HashSet;
import java.util.Set;

public class Employee {
	
	private Partner partner;

	private String number;
	private String code;
	private String nickName;
	private String searchKey;
	private String searchField;
	
	private Department department;    
    private String jobTitle;
    private Employee supervisor;

	
	private Set<Note> privateNotes = new HashSet<Note>();
	private Set<Note> publicNotes = new HashSet<Note>();
	
	private Set<Attachment> privateAttachments = new HashSet<Attachment>();
	private Set<Attachment> publicAttachments = new HashSet<Attachment>();
	
	private Set<CustomProperty> privateCustomProperties = new HashSet<CustomProperty>();
	private Set<CustomProperty> publicCustomProperties = new HashSet<CustomProperty>();

}
