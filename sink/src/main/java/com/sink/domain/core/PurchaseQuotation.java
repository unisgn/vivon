package com.sink.domain.core;

import java.util.HashSet;
import java.util.Set;

public class PurchaseQuotation {

    private String quotationNumber;
    private Set<PurchaseQuotationItem> items = new HashSet<PurchaseQuotationItem>();
    
    private PurchaseQuotationStatus status;
}
