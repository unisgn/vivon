package com.sink.domain.core;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table
public class BankAccount extends EntityBase {

	private String bankBranch;
	private String accountName;
	private String accountNumber;
	
}
