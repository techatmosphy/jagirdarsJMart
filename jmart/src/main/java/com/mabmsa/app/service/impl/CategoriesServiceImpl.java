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
	private CategoriesRepository categoryService;

	public List<Categories> showBrands() {
		return categoryService.findAll();
	}

	public Optional<Categories> getBrand(Long id) {
		return categoryService.findById(id);

	}

}
