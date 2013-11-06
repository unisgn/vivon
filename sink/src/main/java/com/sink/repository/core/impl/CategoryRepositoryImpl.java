package com.sink.repository.core.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.sink.domain.core.Category;
import com.sink.repository.core.CategoryRepository;

@Repository
public class CategoryRepositoryImpl extends AdvancedGenericRepositoryImpl<Category> implements CategoryRepository {
    @SuppressWarnings("unchecked")
    public List<Category> findAllCategoriesWithNoParent() {
        String hql = " SELECT c FROM Category c where c.parent is null ";
        return getSession().createQuery(hql).list();
    }
}
