package com.sink.web.core;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sink.domain.core.Category;
import com.sink.service.core.CategoryService;

@Controller
@RequestMapping(value="/resty/categories")
public class CategoryController {
    
    @Autowired CategoryService serv;
    
    @RequestMapping(method=RequestMethod.POST)
    @ResponseBody
    public Map<String, Object> addCategory(@RequestBody Category c) {
        serv.addCategory(c);
        Map<String, Object> rm = new HashMap<String, Object>(3);
        rm.put("success", "true");
        rm.put("message", "one category added");
        rm.put("data", "none");
        return rm;
    }
    
    @RequestMapping(value="/{id}",method=RequestMethod.GET)
    @ResponseBody
    public Map<String, Object> getCategory(@PathVariable int id) {
        Category c = serv.getCategory(id);
        Map<String, Object> rm = new HashMap<String, Object>(3);
        rm.put("success", "true");
        rm.put("message", "one category get");
        rm.put("data", c);
        return rm;
    }
    
    @RequestMapping(value="/{id}",method=RequestMethod.PUT)
    @ResponseBody
    public Map<String, Object> updateCategory(@RequestBody Category c) {
        serv.updateCategory(c);
        Map<String, Object> rm = new HashMap<String, Object>(3);
        rm.put("success", "true");
        rm.put("message", "one category updated");
        rm.put("data", "none");
        return rm;
    }
    
    @RequestMapping(value="/{id}",method=RequestMethod.DELETE)
    @ResponseBody
    public Map<String, Object> deleteCategory(@PathVariable int id) {
        serv.deleteCategory(id);
        Map<String, Object> rm = new HashMap<String, Object>(3);
        rm.put("success", "true");
        rm.put("message", "one category deleted");
        rm.put("data", "none");
        return rm;
    }
    
    @RequestMapping(value="/{id}/children", method=RequestMethod.GET)
    @ResponseBody
    public Map<String, Object> getChildren(@PathVariable int id) {
        Set<Category> c = serv.getCategory(id).getChildren();
        Map<String, Object> rm = new HashMap<String, Object>(3);
        rm.put("success", "true");
        rm.put("message", "none");
        rm.put("data", c);
        return rm;
    }
    
    @RequestMapping(value="/{id}/children", method=RequestMethod.POST)
    @ResponseBody
    public Map<String, Object> addChildCategory(@PathVariable int id,  @RequestParam int cid) {
        serv.addChildCategory(cid, id);
        Map<String, Object> rm = new HashMap<String, Object>(3);
        rm.put("success", "true");
        rm.put("message", "one child category added");
        rm.put("data", "none");
        return rm;
    }
    
    @RequestMapping(value="/{id}/children", method=RequestMethod.DELETE)
    @ResponseBody
    public Map<String, Object> removeChildCategory(@PathVariable int id, @RequestParam int cid) {
        serv.removeChildCategory(cid, id);
        Map<String, Object> rm = new HashMap<String, Object>(3);
        rm.put("success", "true");
        rm.put("message", "one child category removed");
        rm.put("data", "none");
        return rm;
    }
    
    @RequestMapping(value="/tree", method=RequestMethod.GET)
    @ResponseBody
    public Map<String, Object> getTreeNode(@RequestParam int node) {
        Map<String, Object> rm = new HashMap<String, Object>(3);
        rm.put("success", "true");
        rm.put("message", "get node");
        if(node==0) {
            List<Category> sc = serv.findAllCategoriesWithNoParent();
            rm.put("data", sc);
        } else {
            Set<Category> sc = serv.getCategory(node).getChildren();
            rm.put("data", sc);
        }
        return rm;
        
    }

}
