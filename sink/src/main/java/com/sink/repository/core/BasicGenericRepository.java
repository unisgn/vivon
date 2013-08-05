package com.sink.repository.core;

public interface BasicGenericRepository<T> {
	public T find(int id);
	public int create(T entity);
	public void update(T entity);
	public void delete(T entity);
}