package com.mabmsa.app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mabmsa.app.model.Product;
import com.mabmsa.app.repository.ProductRepository;
import com.mabmsa.app.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	ProductRepository productRepository;

	public Product saveProduct(Product product) {
		return productRepository.save(product);
	}

	@Override
	public List<Product> showProducts() {
		return productRepository.findAll();
	}

	public Long getProductCount() {
		return productRepository.getProductCount();
	}


	public void deleteProduct(Long productId) {
		productRepository.deleteById(productId);

	}
}
