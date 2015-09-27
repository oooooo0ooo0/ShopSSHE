package com.gt.services.base;

import java.util.List;

import com.gt.model.Category;

public interface CategoryServiceI extends BaseServiceI<Category> {
	public List<Category> findCategoryAll(String type);

	public List<Category> findCategoryAll(String type, int page, int size);

	public Long countAll(String type);
}
