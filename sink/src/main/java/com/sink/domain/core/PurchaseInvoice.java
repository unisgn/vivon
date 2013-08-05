package com.sink.domain.core;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

import com.sink.lib.core.PurchaseInvoiceStatus;

public class PurchaseInvoice {

	private String invoiceNumber;
	
	private Set<PurchaseInvoiceItem> items = new HashSet<PurchaseInvoiceItem>();
	private BigDecimal totalSaleAmount;
	private BigDecimal totalTaxAmount;
	private BigDecimal totalPaid;
	
	private PurchaseInvoiceStatus status;
}
