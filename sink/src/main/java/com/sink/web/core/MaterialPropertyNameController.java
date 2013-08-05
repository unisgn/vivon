package com.sink.web.core;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import com.sink.domain.core.MaterialPropertyName;
import com.sink.domain.core.MaterialPropertyValue;


@Controller
@RequestMapping(value="/resty/materialpropertynames")
public class MaterialPropertyNameController {

	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	@ResponseBody
	public Map<String, Object> getMaterialPropertyName(@PathVariable int id) {
		
	}
	
	@RequestMapping(value="/{id}", method=RequestMethod.PUT)
	@ResponseBody
	public Map<String, Object> updateMaterialPropertyName(@RequestBody MaterialPropertyName name) {
		
	}
	
	@RequestMapping(value="/{id}/values", method=RequestMethod.GET)
	@ResponseBody
	public Map<String, Object> getValuesForProperty(@PathVariable int id) {
		
	}
	
	@RequestMapping(value="/{id}/values", method=RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> addValuesToProperty(@PathVariable int id, @RequestBody MaterialPropertyValue value) {
		
	}
	
}
