package com.sink.domain.core;

import java.util.HashSet;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class MaterialPropertyName {
    @JsonIgnore
    private MaterialCategory category;
    
    private String name;
    private boolean discreate;
    private Set<MaterialPropertyValue> valueSet = new HashSet<MaterialPropertyValue>();
    
    
}
