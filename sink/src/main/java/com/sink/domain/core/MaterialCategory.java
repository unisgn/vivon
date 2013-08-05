package com.sink.domain.core;

import java.util.HashSet;
import java.util.Set;

public class MaterialCategory {

	private String name;
	private MaterialCategory parent;
	private Set<MaterialCategory> children = new HashSet<MaterialCategory>();
	private boolean leaf;
	
	private Set<MaterialPropertyName> properties = new HashSet<MaterialPropertyName>();
	
}
