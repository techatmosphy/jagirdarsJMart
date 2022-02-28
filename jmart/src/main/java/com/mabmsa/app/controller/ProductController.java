package com.mabmsa.app.controller;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.mabmsa.app.model.Categories;
import com.mabmsa.app.model.Product;
import com.mabmsa.app.service.impl.CategoriesServiceImpl;
import com.mabmsa.app.service.impl.ProductServiceImpl;

@Controller
public class ProductController {

	Logger logger = LogManager.getLogger(ProductController.class);
	@Autowired
	private ProductServiceImpl productService;
	@Autowired
	private CategoriesServiceImpl categoryService;
//	@GetMapping("/product")
//	public ModelAndView getProducts() {
//		ModelAndView mav = new ModelAndView("productPage");
//		List<Product> productList = productService.showProducts();
//		mav.addObject("products", productList);
//		return mav;
//	}

	@GetMapping("/product")
	public ModelAndView showProduct() {
		ModelAndView mav = new ModelAndView("productPage");

		List<Product> productList = productService.showProducts();
		List<Categories> categoriesList = categoryService.showCategories();

		mav.addObject("products", productList);
		System.out.println(productList.toString());
		mav.addObject("categories", categoriesList);
		return mav;
	}

	@RequestMapping(value = "/saveProduct", method = { RequestMethod.POST, RequestMethod.PUT, RequestMethod.GET })
	public String saveProduct(@ModelAttribute("product") Product product) {
		if (product.getProductCount() == null) {
			product.setProductCount(1);
		} else {
			product.setProductCount(product.getProductCount() + 1);
		}
		productService.saveProduct(product);

		System.out.println(product.toString());
		return "redirect:/product?success";

	}
	@RequestMapping(value = "/deleteProduct",method=RequestMethod.GET)
	public String deleteProduct(@RequestParam (name="productId")Long productId) {
		productService.deleteProduct(productId);
		return "redirect:/product?success";
	}
}
