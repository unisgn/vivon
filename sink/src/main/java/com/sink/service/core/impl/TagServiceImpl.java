package com.sink.service.core.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sink.domain.core.Tag;
import com.sink.repository.core.TagRepository;
import com.sink.service.core.TagService;


@Service
@Transactional
public class TagServiceImpl implements TagService {
	
	@Autowired
	TagRepository tr;
	
	public Tag findTag(int id) {
		return tr.find(id);
	}
	
	public void addTag(Tag tag) {
		tr.create(tag);
	}
	public void updateTag(Tag tag) {
		tr.update(tag);
	}
	public void deleteTag(int id) {
		Tag t = tr.find(id);
		tr.delete(t);
	}
	public int getTotalCount() {
		return tr.getTotalCount();
	}
	public List<Tag> getAllTag() {
		return tr.getAll();
	}
	
}
