package com.sink.domain.core;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

import com.sink.lib.core.PurchaseOrderStatus;

public class PurchaseOrder {

	//concreateActivityNumber;
	private String orderNumber;
	
	private Set<PurchaseOrderItem> items = new HashSet<PurchaseOrderItem>();
	
	private BigDecimal totalAmount;
	private BigDecimal totalTax;
	private BigDecimal totalDelivered;
	
	private PurchaseOrderStatus status;
}
