package com.sink.domain.core;

import java.util.HashSet;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class UomGroup {

	private String name;
	private Uom baseUom;
	
	@JsonIgnore
	private Set<Uom> uoms = new HashSet<Uom>();
}
