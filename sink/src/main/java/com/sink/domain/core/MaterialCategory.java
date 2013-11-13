package com.sink.domain.core;

import java.util.HashSet;
import java.util.Set;

public class MaterialCategory {

    private String name;
    private MaterialCategory parentNode;
    private Set<MaterialCategory> childNodes = new HashSet<MaterialCategory>();
    private boolean leaf;       // true if have no child node
    
    private Set<MaterialPropertyName> properties = new HashSet<MaterialPropertyName>();
    
}
