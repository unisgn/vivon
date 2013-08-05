package com.sink.domain.core;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

import com.sink.lib.core.PurchasePaymentStatus;

public class PurchasePayment {
	
	private String paymentNumber;
	
	Set<PurchasePaymentItem> items = new HashSet<PurchasePaymentItem>();
	
	private BigDecimal totalAmount;
	private PurchasePaymentStatus status;
}
