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
	
	@RequestMapping(method=RequestMethod.GET, value="/id/{id}")
	@ResponseBody
	public Map<String, Object> getAssistant(@PathVariable int id) {
		
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/id/{id}")
	@ResponseBody
	public Map<String, Object> updateAssistant(@RequestBody DroidAssistant assistant) {
		
	}
	
}
