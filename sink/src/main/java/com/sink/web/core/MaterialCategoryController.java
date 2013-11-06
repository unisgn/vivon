package com.sink.web.core;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import com.sink.domain.core.Material;
import com.sink.domain.core.MaterialCategory;
import com.sink.domain.core.MaterialPropertyValue;


@Controller
@RequestMapping(value="/resty/materialcategories")
public class MaterialCategoryController {

    @RequestMapping(method=RequestMethod.GET)
    @ResponseBody
    public Map<String, Object> getMaterialCategoryTree(@RequestParam int rootId) {
        
    }
    
    @RequestMapping(method=RequestMethod.POST)
    @ResponseBody
    public Map<String, Object> addMaterialCategory(@RequestBody MaterialCategory category) {
        
    }
    
    @RequestMapping(method=RequestMethod.GET, value="/{id}")
    @ResponseBody
    public Map<String, Object> getMaterialCategory(@PathVariable int id) {
        
    }
    
    @RequestMapping(method=RequestMethod.PUT, value="/{id}")
    @ResponseBody
    public Map<String, Object> updateMaterialCategory(@RequestBody MaterialCategory category) {
        
    }
    
    @RequestMapping(method=RequestMethod.GET, value="/{categoryId}/materials")
    @ResponseBody
    public Map<String, Object> getMaterialsByCategory(@PathVariable int categoryId, @RequestParam boolean active) {
        
    }
    
    @RequestMapping(method=RequestMethod.POST, value="/{categoryId}/materials")
    @ResponseBody
    public Map<String, Object> addMaterialToCategory(@PathVariable int categoryId, @RequestBody Material material) {
        
    }
    
    
    @RequestMapping(method=RequestMethod.GET, value="/{categoryId}/materialproperties")
    @ResponseBody
    public Map<String, Object> getMaterialPropertiesByCategory(@PathVariable int categoryId) {
        
    }
    
    @RequestMapping(method=RequestMethod.POST, value="/{categoryId}/materialproperties")
    @ResponseBody
    public Map<String, Object> addMaterialPropertyToCategory(@PathVariable int categoryId, @RequestBody MaterialPropertyValue property) {
        
    }
    
    
}
