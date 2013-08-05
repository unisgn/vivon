package com.sink.domain.core;

import java.util.Date;

import com.sink.lib.core.SaleOrderJournalType;

public class SaleOrderJournal {
	private SaleOrder saleOrder;
	private Date journalDate;
	private SaleOrderJournalType type;
	private String message;
	private String operator;
}
