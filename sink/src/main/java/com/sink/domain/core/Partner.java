package com.sink.domain.core;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.sink.lib.core.PartnerRoleLabel;

@Entity
@Table
public class Partner extends EntityAuditable {

    @Column(nullable=false, unique=true, updatable=false)
    private String number;
    
    @Column(unique=true)
    private String code;
    
    @Column(nullable=false, unique=true)
    private String officialName;
    
    private String searchKey;    // custom search key;
    
    @JsonIgnore
    private String searchField;    // system search field;
    
    @Embedded
    private CompanyTaxRegisterInfo taxInfo;
    
    private Boolean isCustomer;
    
    private Set<Contact>  contacts = new HashSet<Contact>();
    private Set<Scn> scns = new HashSet<Scn>();
    private Set<Address> addresses = new HashSet<Address>();
    private Set<BankAccount> bankAccounts = new HashSet<BankAccount>();
    
}
