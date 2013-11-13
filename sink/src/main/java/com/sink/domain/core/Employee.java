package com.sink.domain.core;

import java.util.HashSet;
import java.util.Set;

public class Employee {
    @Column(nullable=false, unique=true, updatable=false)
    private String number;
    private String code;
    private String name;
    private String searchKey;
    private String searchField;
    
    private Department department;    
    private String jobTitle;
    private Employee manager;

}
