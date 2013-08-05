package com.sink.service.core;

import java.util.List;

import org.springframework.security.access.prepost.PreAuthorize;

import com.sink.domain.core.Tag;

public interface TagService {
	
	@PreAuthorize("hasAuthority('ROLE_VIEW_TAG')")
	public Tag findTag(int id);
	
	@PreAuthorize("hasAuthority('ROLE_ADD_TAG')")
	public void addTag(Tag tag);
	
	@PreAuthorize("hasAuthority('ROLE_UPDATE_TAG')")
	public void updateTag(Tag tag);
	
	
	public void deleteTag(int id);
	
	public int getTotalCount();
	
	@PreAuthorize("hasAuthority('ROLE_VIEW_ALL_TAG')")
	public List<Tag> getAllTag();
}
