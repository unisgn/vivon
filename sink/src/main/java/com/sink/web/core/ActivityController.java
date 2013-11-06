package com.sink.web.core;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping(value="/resty/activities")
public class ActivityController {

    @RequestMapping(method=RequestMethod.GET)
    @ResponseBody
    public Map<String, Object> findAllActivities() {
        
    }

    @RequestMapping(value="/period/{startDate}-{endDate}", method=RequestMethod.GET)
    public Map<String, Object> findActivitiesByPeriod() {

    }
    
    @RequestMapping(value="/id/{id}", method=RequestMethod.GET)
    @ResponseBody
    public Map<String, Object> findActivityById(@PathVariable int id) {
    
    }
    
    @RequestMapping(value="/partner/{partnerId}/{startdate}-{enddate}", method=RequestMethod.GET)
    public Map<String, Object> findActivitiesByPartner() {
    
    }
    
    @RequestMapping(value="/type/{type}/{startdate}-{enddate}", method=RequestMethod.GET)
    @ResponseBody
    public Map<String, Object> findActivitiesByType() {
    
    }
}
