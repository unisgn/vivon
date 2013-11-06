package com.sink.web.core;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import com.sink.domain.core.Material;
import com.sink.domain.core.MaterialPropertyValue;


@Controller
@RequestMapping(value="/resty/materials")
public class MaterialController {
    
    @RequestMapping(value="/{id}", method=RequestMethod.GET)
    @ResponseBody
    public Map<String, Object> getMaterial(@PathVariable int id) {
        
    }
    
    @RequestMapping(value="/{id}", method=RequestMethod.PUT)
    @ResponseBody
    public Map<String, Object> updateMaterial(@RequestBody Material material) {
        
    }
    
    @RequestMapping(value="/search", method=RequestMethod.GET)
    @ResponseBody
    public Map<String, Object> searchMaterials(@RequestParam String key) {
        
    }
    
    @RequestMapping(value="/{id}/properties", method=RequestMethod.GET)
    @ResponseBody
    public Map<String, Object> getPropertiesForMaterial(@PathVariable int id) {
        
    }
    
    @RequestMapping(value="/{id}/properties", method=RequestMethod.POST)
    @ResponseBody
    public Map<String, Object> addPropertyToMaterial(@PathVariable int id, @RequestBody MaterialPropertyValue property) {
        
    }
}
