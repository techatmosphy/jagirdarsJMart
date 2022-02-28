package com.mabmsa.app.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.mabmsa.app.model.Brand;
import com.mabmsa.app.model.Categories;
import com.mabmsa.app.service.impl.BrandServiceImpl;
import com.mabmsa.app.service.impl.CategoriesServiceImpl;

@Controller
public class CategoryController {

	@Autowired
	private CategoriesServiceImpl categoryService;
	@Autowired
	private BrandServiceImpl brandServiceImpl;

	@RequestMapping(value = "/getCategories", method = RequestMethod.GET)
	public Optional<Categories> getCategoriesById(@RequestParam(name = "categoryId") Long categoryId, Model model) {
		return categoryService.getCategories(categoryId);
	}

	@GetMapping("/category")
	public ModelAndView showCategory() {
		ModelAndView mav = new ModelAndView("category");
		List<Categories> categoriesList = categoryService.showCategories();
		List<Brand> brandList = brandServiceImpl.showBrands();
		mav.addObject("categories", categoriesList);
		mav.addObject("brandList", brandList);
		return mav;
	}

	@RequestMapping(value = "/saveCategories", method = { RequestMethod.POST, RequestMethod.PUT, RequestMethod.GET })
	public String saveCategories(@ModelAttribute("categories") Categories categories,BindingResult bindingResult) {
		System.out.println(categories.toString());
		categoryService.saveCategories(categories);
		
		return "redirect:/category?success";

	}

	@RequestMapping(value = "/deleteCategories", method = RequestMethod.GET)
	public String deleteCategories(@RequestParam(name = "categoryId") Long categoryId) {
		categoryService.deleteCategories(categoryId);
		return "redirect:/category?success";
	}

}
