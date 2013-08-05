package com.sink.service.core;

import java.util.List;

import com.sink.domain.core.Partner;
import com.sink.lib.core.PartnerRoleLabel;

public interface PartnerService {
	
	public Partner findPartnerById(int id);
	public Partner findPartnerByNumber(String number);
	public Partner findPartnerByCode(String code);
	public Partner findPartnerByName(String name);
	
	public List<Partner> findAllPartners(boolean active);
	public List<Partner> findPartnersByRoleLabel(PartnerRoleLabel label, boolean active);
	public List<Partner> searchPartners(String keyword);
	
}
