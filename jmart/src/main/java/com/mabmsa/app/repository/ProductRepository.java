package com.mabmsa.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.mabmsa.app.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
	@Query(value = "SELECT count(*) FROM product", nativeQuery = true)
	Long getProductCount();
}
