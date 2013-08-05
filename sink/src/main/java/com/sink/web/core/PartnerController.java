package com.sink.web.core;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import com.sink.service.core.PartnerService;



@Controller
@RequestMapping(value = "/resty/partners")
public class PartnerController {

    @Autowired
    PartnerService ps;

	@RequestMapping(method=RequestMethod.GET)
	public Map<String, Object> findAllPartners(@RequestParam boolean active) {

	}

	@RequestMapping(method=RequestMethod.GET, value="/rolelabel/{roleLabel}")
	public Map<String, Object> findPartnersByRoleLabel(@PathVariable PartnerRoleLabel roleLabel, @RequestParam boolean active) {

	}

	@RequestMapping(method=RequestMethod.GET, value="/id/{id}")
	public Map<String, Object> getPartnerById(@PathVariable int id) {

	}

	
}
