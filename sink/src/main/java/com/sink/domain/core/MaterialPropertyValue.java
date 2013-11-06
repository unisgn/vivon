package com.sink.domain.core;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table
public class MaterialPropertyValue extends EntityBase {
    @JsonIgnore
    private MaterialPropertyName name;
    private String value;
    
}
