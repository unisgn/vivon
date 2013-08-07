package com.sink.service.core;

import java.util.List;

import com.sink.domain.core.Vendor;

public interface VendorService {

	public Vendor findVendorById(int id);
	public Vendor findVendorByName(String name);
	
	public List<Vendor> findAllVendors(boolean active);
	
	public List<Vendor> searchVendors(String keyword);
	
	public int addVendor(Vendor vendor);
	public void updateVendor(Vendor vendor);
	


}
