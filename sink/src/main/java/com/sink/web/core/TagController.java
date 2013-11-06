package com.sink.web.core;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


import com.sink.domain.core.Tag;
import com.sink.service.core.TagService;

@Controller
@RequestMapping(value="/resty/tags")
public class TagController {
    
    @Autowired
    TagService ts;
    
    @RequestMapping(method=RequestMethod.GET)
    @ResponseBody
    public Map<String, Object> getAllTags() {
        List<Tag> tags = ts.getAllTag();
        int c = ts.getTotalCount();
        Map<String, Object> rm = new HashMap<String, Object>(4);
        rm.put("success", "true");
        rm.put("totalCount", c);
        rm.put("message", "get all tags, totalCount" + c);
        rm.put("data", tags);
        return rm;
    }
    
    @RequestMapping(method=RequestMethod.POST)
    @ResponseBody
    public Map<String, Object> addTag(@RequestBody Tag tag) {
        ts.addTag(tag);
        Map<String, Object> rm = new HashMap<String, Object>(2);
        rm.put("success", "true");
        rm.put("message", "one tag added");
        return rm;
    }
    
    @RequestMapping(value="/{id}", method=RequestMethod.GET)
    @ResponseBody
    public Map<String, Object> findTag(@PathVariable int id) {
        Tag t = ts.findTag(id);
        Map<String, Object> rm = new HashMap<String, Object>(3);
        rm.put("success", "true");
        rm.put("message", "get one tag");
        rm.put("data", t);
        return rm;
    }
    
    @RequestMapping(value="/{id}", method=RequestMethod.PUT)
    @ResponseBody
    public Map<String, Object> updateTag(@RequestBody Tag tag) {
        ts.updateTag(tag);
        Map<String, Object> rm = new HashMap<String, Object>(2);
        rm.put("success", "true");
        rm.put("message", "one tag updated");
        return rm;
    }
    
    @RequestMapping(value="/{id}", method=RequestMethod.DELETE)
    @ResponseBody
    public Map<String, Object> deleteTag(@PathVariable int id) {
        ts.deleteTag(id);
        Map<String, Object> rm = new HashMap<String, Object>(2);
        rm.put("success", "true");
        rm.put("message", "one tag deleted");
        return rm;
    }

}
