package com.sink.domain.core;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table
public class Address extends EntityBase {
    
    private String state;
    private String city;
    private String address;
    
    
}
