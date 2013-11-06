package com.sink.domain.core;

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import com.sink.lib.core.SaleInvoiceStatus;

public class SaleInvoice extends Activity {

    //concreateActivityNumber
    private String invoiceNumber;
    
    private Set<SaleInvoiceItem> items = new HashSet<SaleInvoiceItem>();
    
    private BigDecimal totalSaleAmount;
    private BigDecimal totalTaxAmount;
    private BigDecimal totalPaid;
    private SaleInvoiceStatus invoiceStatus;
    
}
