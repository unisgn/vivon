package com.sink.repository.core;
import java.util.List;

import com.sink.repository.core.BasicGenericRepository;

public interface AdvancedGenericRepository<T> extends BasicGenericRepository<T> {
	public int getTotalCount();
	public List<T> getAll();
	
}