package com.mabmsa.app.service;

import java.util.List;
import java.util.Optional;

import com.mabmsa.app.model.Categories;

public interface CategoriesService {

	Optional<Categories> getCategories(Long id);

	List<Categories> showCategories();

	void saveCategories(Categories categories);

}
