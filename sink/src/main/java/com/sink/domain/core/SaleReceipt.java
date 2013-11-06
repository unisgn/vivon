package com.sink.domain.core;

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import com.sink.lib.core.SaleReceiptStatus;

public class SaleReceipt {

    private String receiptNumber;
    
    private Set<SaleReceiptItem> items = new HashSet<SaleReceiptItem>();
    
    private BigDecimal totalAmount;
    
    private SaleReceiptStatus receiptStatus;
    
}
