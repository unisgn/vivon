package com.sink.domain.core;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

public class FinancialAccount {
	
	private String number;
	private String name;
	private FinancialAccountType type;
	
	private FinancialAccount parent;
	private Set<FinancialAccount> children = new HashSet<FinancialAccount>();
	private boolean leaf;
	
	private BigDecimal balance;
}
