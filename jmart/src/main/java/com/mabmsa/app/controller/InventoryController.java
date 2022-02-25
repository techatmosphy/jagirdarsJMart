package com.mabmsa.app.controller;

import java.util.List;
import java.util.Optional;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.mabmsa.app.model.Inventory;
import com.mabmsa.app.service.impl.InventoryServiceImpl;

@Controller
public class InventoryController {

	Logger logger = LogManager.getLogger(InventoryController.class);

	@Autowired
	private InventoryServiceImpl inventoryService;

	@GetMapping(value = "/getInventory")
	public Optional<Inventory> getInventoryById(Long Id, Model model) {
		logger.info("Enter into BrandController getBrandById method");
		return inventoryService.getInventory(Id);
	}

	@GetMapping("/inventory")
	public ModelAndView showBrands() {
		ModelAndView mav = new ModelAndView("inventory");
		List<Inventory> inventoryList = inventoryService.showInventory();
		System.out.println(inventoryList);
		mav.addObject("inventory", inventoryList);
		return mav;
	}

//	@RequestMapping(value = "/saveInventory", method = { RequestMethod.POST, RequestMethod.PUT, RequestMethod.GET })
//	public String saveInventory(@ModelAttribute("inventory") InventoryDto inventoryDto) {
//		inventoryService.saveInventory(inventoryDto);
//		return "redirect:/registration?success";
//
//	}

}
