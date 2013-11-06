package com.sink.domain.core;

import java.util.HashSet;
import java.util.Set;

public class Department {

    private String number;
    private String code;
    private String name;
    
    private Employee leader;
    
    private Set<Employee> employees = new HashSet<Employee>();
}
