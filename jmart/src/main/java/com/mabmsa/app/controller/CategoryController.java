package com.mabmsa.app.controller;

import java.util.List;
import java.util.Optional;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.mabmsa.app.model.Categories;
import com.mabmsa.app.service.impl.CategoriesServiceImpl;

@RestController
public class CategoryController {

	Logger logger = LogManager.getLogger(CategoryController.class);

	@Autowired
	private CategoriesServiceImpl categoryService;

	@GetMapping(value = "/getCategories")
	public Optional<Categories> getCategoriesById(Long Id, Model model) {
		logger.info("Enter into BrandController getBrandById method");
		return categoryService.getBrand(Id);
	}

	@GetMapping("/category")
	public ModelAndView showCategory() {
		ModelAndView mav = new ModelAndView("categoryPage");
		List<Categories> categoriesList = categoryService.showBrands();
		logger.info(categoriesList);
		mav.addObject("categories", categoriesList);

		return mav;
	}

//	@GetMapping("/brand")
//	private String getBrand(Model model) {
////		return findPaginated(1, "firstName", "asc", model);
//	}

//	@GetMapping("/page/{pageNo}")
//	public String findPaginated(@PathVariable(value = "pageNo") int pageNo, @RequestParam("sortField") String sortField,
//			@RequestParam("sortDir") String sortDir, Model model) {
//		int pageSize = 10;
//
//		Page<Brand> page = brandService.findPaginated(pageNo, pageSize, sortField, sortDir);
//		List<Brand> listUsers = page.getContent();
//
//		model.addAttribute("currentPage", pageNo);
//		model.addAttribute("totalPages", page.getTotalPages());
//		model.addAttribute("totalItems", page.getTotalElements());
//
//		model.addAttribute("sortField", sortField);
//		model.addAttribute("sortDir", sortDir);
//		model.addAttribute("reverseSortDir", sortDir.equals("asc") ? "desc" : "asc");
//
//		model.addAttribute("listUsers", listUsers);
//		return "brand";
//	}

//	@RequestMapping(value = "/saveBrand", method = { RequestMethod.POST, RequestMethod.PUT, RequestMethod.GET })
//	public String saveBrand(@ModelAttribute("brand") BrandDto brandDto) {
//		brandService.saveBrand(brandDto);
//		return "redirect:/registration?success";
//
//	}

}
