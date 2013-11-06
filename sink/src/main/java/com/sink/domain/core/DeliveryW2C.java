package com.sink.domain.core;

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import com.sink.lib.core.DeliveryW2CStatus;

public class DeliveryW2C {

    private String deliveryNumber;

    
    private Set<DeliveryW2CItem> items = new HashSet<DeliveryW2CItem>();
    
    private DeliveryW2CStatus status;

    private BigDecimal totalAmount;
    private BigDecimal totalInvoiced;
}
