package com.sink.web.core;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import com.sink.domain.core.MaterialPropertyValue;


@Controller
@RequestMapping(value="/resty/materialpropertyvalues")
public class MaterialPropertyValueController {

	@RequestMapping(method=RequestMethod.GET, value="/{id}")
	@ResponseBody
	public Map<String, Object> getMaterialPropertyValue(@PathVariable int id) {
		
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/{id}")
	@ResponseBody
	public Map<String, Object> updateMaterialPropertyValue(@RequestBody MaterialPropertyValue value) {
		
	}
}
