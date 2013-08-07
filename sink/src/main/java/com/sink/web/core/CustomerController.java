package com.sink.web.core;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;



import com.sink.domain.core.Customer;
import com.sink.lib.core.ResponseMap;
import com.sink.service.core.CustomerLabelService;
import com.sink.service.core.CustomerService;
import com.sink.service.core.UserService;



// TODO catch AuthenticationException;
@Controller
@RequestMapping(value="/resty/customers")
public class CustomerController {

    @Autowired
    CustomerService cs;
    UserService us;
	CustomerLabelService cls;
    
	@RequestMapping(method=RequestMethod.GET)
	@ResponseBody
	public Map<String, Object> findAllCustomers(@RequestParam boolean active) {
		List<Customer> cl = cs.findAllCustomers(active);
		return ResponseMap.returnMap("true", cl, "");
	}
	
	@RequestMapping(method=RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> addCustomer(@RequestBody Customer customer) {
		cs.addCustomer(customer);
		return ResponseMap.returnMap("true", "", "");
		
		//TODO catch CustomerExistException;
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/{id}")
	@ResponseBody
	public Map<String, Object> getCustomer(@PathVariable int id) {

		Customer c = cs.findCustomerById(id);
		return ResponseMap.returnMap("true", c, "");
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/{id}")
	@ResponseBody
	public Map<String, Object> updateCustomer(@RequestBody Customer customer) {
		cs.updateCustomer(customer);
		return ResponseMap.returnMap("true", "", "");
	}
	
	
	@RequestMapping(value="/search")
	@ResponseBody
	public Map<String, Object> searchCustomers(@RequestParam String searchkey) {
		List<Customer> cl = cs.searchCustomers(searchkey);
		return ResponseMap.returnMap("true", cl, "");
	}
	
		
}

