package com.mabmsa.app.controller;

import java.util.List;
import java.util.Optional;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.mabmsa.app.model.Brand;
import com.mabmsa.app.service.impl.BrandServiceImpl;

@Controller
public class BrandController {

	@Autowired
	private BrandServiceImpl brandService;
	Logger logger = LogManager.getLogger(BrandController.class);

	@GetMapping("/brand")
	public ModelAndView showBrands() {
		ModelAndView mav = new ModelAndView("brand");
		List<Brand> brandsList = brandService.showBrands();
		mav.addObject("brands", brandsList);
		return mav;
	}

	@RequestMapping(value = "/getBrand",method=RequestMethod.GET)
	public Optional<Brand> getBrandById(@RequestParam (name="id") Long Id, Model model) {
		return brandService.getBrand(Id);
	}


	@RequestMapping(value = "/deleteBrand",method=RequestMethod.GET)
	public String deleteBrand(@RequestParam (name="brandId")Long brandId) {
		brandService.deleteBrand(brandId);
		return "redirect:/brand?success";
	}

	@RequestMapping(value = "/saveBrand", method = { RequestMethod.POST, RequestMethod.PUT, RequestMethod.GET })
	public String saveBrand(@ModelAttribute("brand") Brand brand) {
		brandService.saveBrand(brand);
		return "redirect:/brand?success";

	}

}
