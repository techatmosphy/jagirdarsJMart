package com.mabmsa.app.controller;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.mabmsa.app.model.Product;
import com.mabmsa.app.service.impl.ProductServiceImpl;

@Controller
public class ProductController {

	Logger logger = LogManager.getLogger(ProductController.class);
	@Autowired
	private ProductServiceImpl productService;

	public ProductController(ProductServiceImpl productService) {
		super();
		this.productService = productService;
	}

	@GetMapping("/product")
	public ModelAndView getProducts() {
		ModelAndView mav = new ModelAndView("productPage");
		List<Product> productList = productService.showProducts();
		mav.addObject("products", productList);
		return mav;
	}

}
