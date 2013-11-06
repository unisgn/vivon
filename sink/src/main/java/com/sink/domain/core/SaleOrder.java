package com.sink.domain.core;

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import com.sink.lib.core.SaleOrderStatus;

public class SaleOrder extends Activity {

    //concreateActivityNumber;
    private String concreteActivityNumber;
    

    private Set<SaleOrderItem> items = new HashSet<SaleOrderItem>();
    
    private BigDecimal totalAmount;
    private BigDecimal totalTax;
    private BigDecimal totalDelivered;
    
    //concreateActivityStatus;
    private SaleOrderStatus concreteActivityStatus;
    
}
