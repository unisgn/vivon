package com.sink.domain.core;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
@Table
public class Customer extends EntityAuditable {

    private Partner partner;
    
    @Column(nullable=false, unique=true, updatable=false)
    private String number;
    
    @Column(unique=true)
    private String code;
    
    @Column(nullable=false, unique=true)
    private String nickName;
    
    private String searchKey;
    
    @JsonIgnore
    private String searchField;
    
    @Embedded
    private CompanyTaxRegisterInfo taxInfo;
    
    
    private Set<CustomerLabel> labels = new HashSet<CustomerLabel>();
    
    public Customer() {}
}
