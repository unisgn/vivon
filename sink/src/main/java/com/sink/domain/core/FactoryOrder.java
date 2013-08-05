package com.sink.domain.core;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.sink.lib.core.FactoryOrderStatus;

public class FactoryOrder {

	private Date orderDate;
	private String orderNumber;
	
	private List<FactoryOrderItem> items = new ArrayList<FactoryOrderItem>();
	
	private FactoryOrderStatus orderStatus;
	
	private User submitBy;
	private Date dateOfSubmit;
	private User approvedBy;
	private Date dateOfApprove;
}
