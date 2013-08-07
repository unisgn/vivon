package com.sink.web.core;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


import com.sink.domain.core.Vendor;
import com.sink.lib.core.ResponseMap;
import com.sink.service.core.VendorService;

@Controller
@RequestMapping(value="/resty/vendors")
public class VendorController {
	
	@Autowired
	VendorService vs;
	
	@RequestMapping(method=RequestMethod.GET)
	@ResponseBody
	public Map<String, Object> findAllVendors(@RequestParam boolean active) {
		List<Vendor> vl = vs.findAllVendors(active);
		return ResponseMap.returnMap("true", vl, "");
	}
	
	@RequestMapping(method=RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> addVendor(@RequestBody Vendor vendor) {
		vs.addVendor(vendor);
		return ResponseMap.returnMap("true", "", "");
	}
	
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	@ResponseBody
	public Map<String, Object> getVendor(@PathVariable int id) {
		Vendor v = vs.findVendorById(id);
		return ResponseMap.returnMap("true", v, "");
	}
	
	@RequestMapping(value="/{id}", method=RequestMethod.PUT)
	@ResponseBody
	public Map<String, Object> updateVendor(@RequestBody Vendor vendor) {
		vs.updateVendor(vendor);
		return ResponseMap.returnMap("true", "", "");
	}
	
	@RequestMapping(value="/search", method=RequestMethod.GET)
	@ResponseBody
	public Map<String, Object> searchVendors(@RequestParam String key) {
		List<Vendor> vl = vs.searchVendors(key);
		return ResponseMap.returnMap("true", vl, "");
	}

}
