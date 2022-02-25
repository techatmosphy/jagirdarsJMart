package com.mabmsa.app.controller;

import java.util.List;
import java.util.Optional;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.mabmsa.app.model.Brand;
import com.mabmsa.app.service.impl.BrandServiceImpl;

@RestController
public class BrandController {

	@Autowired
	private BrandServiceImpl brandService;
	Logger logger = LogManager.getLogger(BrandController.class);

	@DeleteMapping("/deleteBrand/{id}")
	public String deleteBrand(@PathVariable(value = "id") Long id) {
		brandService.deleteBrand(id);
		return "redirect: /registration?success";
	}

	@GetMapping("/brand")
	public ModelAndView showBrands() {
		ModelAndView mav = new ModelAndView("brand");
		List<Brand> brandsList = brandService.showBrands();
		mav.addObject("brands", brandsList);
		return mav;
	}

	@GetMapping(value = "/getBrand")
	public Optional<Brand> getBrandById(Long Id, Model model) {
		logger.info("Enter into BrandController getBrandById method");
		return brandService.getBrand(Id);
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

	@RequestMapping(value = "/saveBrand", method = { RequestMethod.POST, RequestMethod.PUT, RequestMethod.GET })
	public String saveBrand(@ModelAttribute("brand") Brand brand) {
		brandService.saveBrand(brand);
		return "redirect: /registration?success";

	}

}
