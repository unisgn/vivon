package com.sink.domain.core;

import java.util.Date;

import com.sink.lib.core.PurchaseOrderJournalType;

public class PurchaseOrderJournal {
	
	private PurchaseOrder order;
	private Date journalDate;
	private PurchaseOrderJournalType type;
	private String message;
	private String operator;
}
