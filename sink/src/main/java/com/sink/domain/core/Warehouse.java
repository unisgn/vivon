package com.sink.domain.core;

import java.util.HashSet;
import java.util.Set;

public class Warehouse {
    
    private String name;
    private Warehouse parentNode;
    private Set<Warehouse> childNodes = new HashSet<Warehouse>();
    private boolean leaf;
}
