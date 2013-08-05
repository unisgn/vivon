package com.sink.domain.core;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

import com.sink.lib.core.DeliveryV2WStatus;

public class DeliveryV2W {

	private String deliveryNumber;
	private DeliveryV2WStatus status;
	private Set<DeliveryV2WItem> items = new HashSet<DeliveryV2WItem>();

	private BigDecimal totalGoodsValue;
	private BigDecimal totalInvoiceAmount;
}
