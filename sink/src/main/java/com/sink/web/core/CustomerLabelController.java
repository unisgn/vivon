package com.sink.web.core;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping(value="/resty/customerlabels")
public class CustomerLabelController {

    @RequestMapping(value="/id/{id}", method=RequestMethod.GET)
    @ResponseBody
    public Map<String, Object> getCustomerLabel(@PathVariable int id) {
        
    }
    
    @RequestMapping(value="/id/{id}", method=RequestMethod.PUT)
    @ResponseBody
    public Map<String, Object> updateCustomerLabel(@RequestBody CustomerLabel label) {
        
    }
    

    @RequestMapping(value="/assistant/id/{assistantId}", method=RequestMethod.GET)
    @ResponseBody
    public Map<String, Object> findCustomerLabelsByAssistant(@PathVariable int assistant id) {

    }
    
}
