package com.sink.domain.core;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

public class FinancialAccount {
    @Column(nullable=false, unique=true)
    private String number;
    
    @Column(unique=true)
    private String code;
    
    private String name;
    
    private FinancialAccountType type;
    
    private FinancialAccount parentNode;
    private Set<FinancialAccount> childNodes = new HashSet<FinancialAccount>();
    @Column(nullable=false)
    private boolean leaf;       // true if have no childNodes
    @Column(nullable=false)
    private BigDecimal balance;
}
