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
	
	// custom search key;
	private String searchKey;
	
	// system search field;
	@JsonIgnore
	private String searchField;
	
	private Set<CustomProperty> privateCustomProperties = new HashSet<CustomProperty>();
	private Set<CustomProperty> publicCustomProperties = new HashSet<CustomProperty>();

	//TODO
	private Set<PartnerRoleLabel> roleLabels = new HashSet<PartnerRoleLabel>();
	
	private Set<Contact>  contacts = new HashSet<Contact>();
	private Set<Scn> scns = new HashSet<Scn>();
	private Set<Address> addresses = new HashSet<Address>();
	private Set<BankAccount> bankAccounts = new HashSet<BankAccount>();
	
}
