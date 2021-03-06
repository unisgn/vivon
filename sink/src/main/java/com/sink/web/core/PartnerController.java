package com.sink.web.core;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import com.sink.domain.core.Partner;
import com.sink.lib.core.PartnerRoleLabel;
import com.sink.lib.core.ResponseMap;
import com.sink.service.core.PartnerService;



@Controller
@RequestMapping(value = "/resty/partners")
public class PartnerController {

    @Autowired
    PartnerService ps;

    @RequestMapping(method=RequestMethod.GET)
    public Map<String, Object> findAllPartners() {
        List<Partner> pl = ps.findAllPartners(active);
        return ResponseMap.returnMap("true", pl, "");
    }

    @RequestMapping(method=RequestMethod.GET, value="/rolelabel/{roleLabel}")
    public Map<String, Object> findPartnersByRoleLabel(@PathVariable PartnerRoleLabel roleLabel, @RequestParam boolean active) {
        List<Partner> pl = ps.findPartnersByRoleLabel(roleLabel, active);
        return ResponseMap.returnMap("true", pl, "");
    }

    @RequestMapping(method=RequestMethod.GET, value="/id/{id}")
    public Map<String, Object> getPartnerById(@PathVariable int id) {
        Partner p = ps.findPartnerById(id);
        return ResponseMap.returnMap("true", p, "");
    }
}
