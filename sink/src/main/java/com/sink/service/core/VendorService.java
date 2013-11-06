package com.sink.service.core;

import java.util.List;

import com.sink.domain.core.Vendor;

public interface VendorService {

    public Vendor findVendorById(int id);
    public Vendor findVendorByName(String name);
    public Vendor findVendorByNumber(String number);
    public Vendor findVendorByCode(String code);
    
    public List<Vendor> findAllVendors();
    
    public List<Vendor> searchVendors(String keyword);
    
    public int addVendor(Vendor vendor);
    public void updateVendor(Vendor vendor);
    public void toggleActiveOfVendor(int id);
    


}
