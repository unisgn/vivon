package com.sink.service.core;

import java.util.List;

import com.sink.domain.core.Category;

public interface CategoryService {
	public Category getCategory(int id);
	public int addCategory(Category category);
	public void updateCategory(Category category);
	public void deleteCategory(int id);
	
	public void addChildCategory(int childId, int parentId);
	public void removeChildCategory(int childId, int parentId);
	
	public List<Category> findAllCategoriesWithNoParent();
}
