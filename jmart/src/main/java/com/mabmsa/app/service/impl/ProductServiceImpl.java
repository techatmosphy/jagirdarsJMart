package com.mabmsa.app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mabmsa.app.controller.dto.ProductDto;
import com.mabmsa.app.model.Product;
import com.mabmsa.app.repository.ProductRepository;
import com.mabmsa.app.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	ProductRepository productRepository;

	public void saveProduct(ProductDto productDto) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Product> showProducts() {
		return productRepository.findAll();
	}

}
