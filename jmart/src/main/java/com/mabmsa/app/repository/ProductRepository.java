package com.mabmsa.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mabmsa.app.controller.dto.BrandDto;
import com.mabmsa.app.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

	void save(BrandDto brandDto);
}
