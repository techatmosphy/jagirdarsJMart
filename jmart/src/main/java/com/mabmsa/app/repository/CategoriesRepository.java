package com.mabmsa.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mabmsa.app.model.Categories;

public interface CategoriesRepository extends JpaRepository<Categories, Long> {

}
