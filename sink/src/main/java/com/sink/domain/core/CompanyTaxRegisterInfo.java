package com.sink.domain.core;

import javax.persistence.Embeddable;

@Embeddable
public class CompanyTaxRegisterInfo {

	private String companyName;
	private String taxNumber;
	private String address;
	private String phone;
	private String bankBranch;
	private String accountNumber;
}
