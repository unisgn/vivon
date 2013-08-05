package com.sink.web.core;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping(value="/resty/customerlabels")
public class CustomerLabelController {

	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	@ResponseBody
	public Map<String, Object> getCustomerLabel(@PathVariable int id) {
		
	}
	
	@RequestMapping(value="{/id}", method=RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> updateCustomerLabel(@RequestBody CustomerLabel label) {
		
	}
	
	
}
