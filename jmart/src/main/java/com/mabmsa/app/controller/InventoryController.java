package com.mabmsa.app.controller;

import java.util.ArrayList;
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
import com.mabmsa.app.model.Product;
import com.mabmsa.app.service.ItemsServiceImpl;
import com.mabmsa.app.service.impl.InventoryServiceImpl;
import com.mabmsa.app.service.impl.ProductServiceImpl;

@Controller
public class InventoryController {

	Logger logger = LogManager.getLogger(InventoryController.class);

	@Autowired
	private InventoryServiceImpl inventoryService;
	@Autowired
	private ProductServiceImpl ProductServiceImpl;
	
	@Autowired
	private ItemsServiceImpl itemsServiceImpl;

	@GetMapping(value = "/getInventory")
	public Optional<Inventory> getInventoryById(Long Id, Model model) {
		logger.info("Enter into BrandController getBrandById method");
		return inventoryService.getInventory(Id);
	}

	@GetMapping("/inventory")
	public ModelAndView showBrands() {
		ModelAndView mav = new ModelAndView("inventory");		

		List<Inventory> inventories=new ArrayList<>();
		List<Product> products=ProductServiceImpl.showProducts();
		
		//lopping products to get invenetory information
		for (Product product : products) {
			Inventory inventory=new Inventory();
			inventory.setProductName(product.getProductName());
			Double productPrice=product.getPrice();
			inventory.setUnitPrice(productPrice);
			
			long productItemCount=itemsServiceImpl.getItemCountByProductId(product.getProductId());
			inventory.setQtyInHand(productItemCount);
			inventory.setSoldQty(Long.valueOf(0));
			inventory.setInventryValue(product.getPrice()*productItemCount);
			inventory.setSalesValue(Double.valueOf(0));
			inventories.add(inventory);
		}
		
		System.out.println(inventories);
		mav.addObject("inventory", inventories);
		return mav;
	}

//	@RequestMapping(value = "/saveInventory", method = { RequestMethod.POST, RequestMethod.PUT, RequestMethod.GET })
//	public String saveInventory(@ModelAttribute("inventory") InventoryDto inventoryDto) {
//		inventoryService.saveInventory(inventoryDto);
//		return "redirect:/registration?success";
//
//	}
//	@RequestMapping(value = "/deleteCategories", method = RequestMethod.GET)
//	public String deleteCategories(@RequestParam(name = "categoryId") Long categoryId) {
//		categoryService.deleteCategories(categoryId);
//		return "redirect:/category?success";
//	}
}
