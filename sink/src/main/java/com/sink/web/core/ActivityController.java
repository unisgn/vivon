package com.sink.web.core;


@Controller
@RequestMapping(value="/resty/activities")
public class ActivityController {

	@RequestMapping(value="/{startdate}-{enddate}/{status}", method=RequestMethod.GET)
	@ResponseBody
	public Map<String, Object> findAllActivities() {
		
	}
	
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	@ResponseBody
	public Map<String, Object> findActivityById(@PathVariable int id) {
	
	}
	
	@RequestMapping(value="/partner/{partnerId}/{startdate}-{enddate}/{status}")
	public Map<String, Object> findActivitiesByPartner() {
	
	}
	
	@RequestMapping(value="/type/{type}/{startdate}-{enddate}/{status}")
	@ResponseBody
	public Map<String, Object> findActivitiesByType() {
	
	}
}