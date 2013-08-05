package com.sink.domain.core;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class FinancialAccountJournal {
	private String number;
	private Date date;
	private Set<FinancialAccountJournalItem> items = new HashSet<FinancialAccountJournalItem>();
	
	private boolean adjusted;
	private boolean booked;
}
