package com.mabmsa.app.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mabmsa.app.model.Categories;
import com.mabmsa.app.repository.CategoriesRepository;
import com.mabmsa.app.service.CategoriesService;

@Service
public class CategoriesServiceImpl implements CategoriesService {

	@Autowired
	private CategoriesRepository categoriesRepository;

	@Override
	public List<Categories> showCategories() {
		return categoriesRepository .findAll();
	}

	@Override
	public Optional<Categories> getCategories(Long categoryId) {
		return categoriesRepository.findById(categoryId);

	}
	@Override
	public void saveCategories(Categories categories) {
		categoriesRepository .save(categories);
		
	}

	public void deleteCategories(Long categoryId) {
		categoriesRepository .deleteById(categoryId);
		
	}

}
