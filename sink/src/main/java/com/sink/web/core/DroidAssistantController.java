package com.sink.web.core;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import com.sink.domain.core.Customer;
import com.sink.domain.core.CustomerLabel;
import com.sink.domain.core.DroidAssistant;


@Controller
@RequestMapping("value=/resty/droidassistants")
public class DroidAssistantController {

	@RequestMapping(method=RequestMethod.GET)
	@ResponseBody
	public Map<String, Object> getAllAssistants() {
		
	}
	
	@RequestMapping(method=RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> addAssistant(@RequestBody DroidAssistant assistant) {
		
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/{id}")
	@ResponseBody
	public Map<String, Object> getAssistant(@PathVariable int id) {
		
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/{id}")
	@ResponseBody
	public Map<String, Object> updateAssistant(@RequestBody DroidAssistant assistant) {
		
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/{id}/customerlabels")
	@ResponseBody
	public Map<String, Object> getCustomerLabelsByAssistant(@PathVariable int id) {
		
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/{id}/customerlabels")
	@ResponseBody
	public Map<String, Object> addCustomerLabelToAssistant(@PathVariable int id, @RequestBody CustomerLabel label) {
		
	}
	
	@RequestMapping(value="/{id}/customers", method=RequestMethod.GET)
	@ResponseBody
	public Map<String, Object> getCustomersByAssistant(@PathVariable int id) {
		
	}
	
	@RequestMapping(value="/{id}/customers", method=RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> addCustomerToAssistant(@PathVariable int id, @RequestBody Customer customer) {
		
	}
	
	@RequestMapping(value="/{id}/customers/search", method=RequestMethod.GET)
	@ResponseBody
	public Map<String, Object> searchCustomerUnderAssistant(@PathVariable int id, @RequestParam String key) {
		
	}
}
