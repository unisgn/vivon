package com.sink.web.core;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping(value="/resty/employees")
public class EmployeeController {

	@Autowired
	EmployeeService es;
	
	@RequestMapping(method=RequestMethod.GET)
	@ResponseBody
	public Map<String, Object> findAllEmployees(@RequestParam boolean active) {
	
	}
	
	@RequsetMapping(method=RequestMethod.POST)
	@RequestBody
	public Map<String, Object> addEmployee(@RequestBody Employee employee) {
	
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/{id}")
	@ResponseBody
	public Map<String, Object> getEmployee(@PathVariable int id) {
	
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/{id}")
	@ResponseBody
	public Map<String, Object> updateEmployee(@PathVariable int id) {
	
	}
}
