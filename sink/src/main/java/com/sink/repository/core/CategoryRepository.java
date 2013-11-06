package com.sink.repository.core;

import java.util.List;

import com.sink.domain.core.Category;

public interface CategoryRepository extends AdvancedGenericRepository<Category> {

    public List<Category> findAllCategoriesWithNoParent();
}
