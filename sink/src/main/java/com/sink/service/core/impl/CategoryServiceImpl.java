package com.sink.service.core.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sink.domain.core.Category;
import com.sink.repository.core.CategoryRepository;
import com.sink.service.core.CategoryService;

@Service
@Transactional
public class CategoryServiceImpl implements CategoryService {
	
	@Autowired CategoryRepository repo;
	
	public Category getCategory(int id) {
		return repo.find(id);
	}
	public int addCategory(Category c) {
		c.setActive(true);
		c.setLeaf(true);
		return repo.create(c);
	}
	public void updateCategory(Category c) {
		repo.update(c);
	}
	public void deleteCategory(int id) {
		Category c = repo.find(id);
		repo.delete(c);
	}
	
	public void addChildCategory(int cid, int pid) {
		Category c = repo.find(cid);
		Category p = repo.find(pid);
		p.getChildren().add(c);
		p.setLeaf(false);
		c.setParent(p);
		repo.update(p);
		repo.update(c);
	}
	public void removeChildCategory(int cid, int pid) {
		Category c = repo.find(cid);
		Category p = repo.find(pid);
		p.getChildren().remove(c);
		if(p.getChildren().isEmpty()) {
			p.setLeaf(true);
		}
		c.setParent(null);
		repo.update(p);
		repo.update(c);
	}
	
	public List<Category> findAllCategoriesWithNoParent() {
		return repo.findAllCategoriesWithNoParent();
	}
}
