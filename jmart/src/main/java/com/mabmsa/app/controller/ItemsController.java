package com.mabmsa.app.controller;

import java.io.OutputStream;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.mabmsa.app.helpers.ZXingHelper;
import com.mabmsa.app.model.Items;
import com.mabmsa.app.model.Product;
import com.mabmsa.app.service.ItemsServiceImpl;
import com.mabmsa.app.service.impl.ProductServiceImpl;

@Controller
public class ItemsController {

	Logger logger = LogManager.getLogger(ItemsController.class);
	@Autowired
	private ItemsServiceImpl itemsService;
	@Autowired
	private ProductServiceImpl productServiceImpl;

	@GetMapping("/items")
	public ModelAndView showItems() {
		ModelAndView mav = new ModelAndView("productItem");

		List<Items> itemsList = itemsService.showItems();
		List<Product> productList = productServiceImpl.showProducts();

		mav.addObject("items", itemsList);
		System.out.println(itemsList.toString());
		mav.addObject("products", productList);
		return mav;
	}

	@RequestMapping(value = "/saveItem", method = { RequestMethod.POST, RequestMethod.PUT, RequestMethod.GET })
	public String saveItems(@ModelAttribute("items") Items items) {
		Long count = itemsService.getItemCount();
		items.setItemCount(count + 1);
		itemsService.saveItems(items);

		System.out.println(items.toString());
		return "redirect:/items?success";

	}
	@RequestMapping(value = "/deleteItem",method=RequestMethod.GET)
	public String deleteItem(@RequestParam (name="itemId")Long itemId) {
		itemsService.deleteBrand(itemId);
		return "redirect:/items?success";
	}
	
	@RequestMapping(value = "/barcode/{id}", method = RequestMethod.GET)
	public void barcode(@PathVariable("id") String id, HttpServletResponse response) throws Exception {
		response.setContentType("image/png");
		OutputStream outputStream = response.getOutputStream();
		outputStream.write(ZXingHelper.getBarCodeImage(id, 200, 200));
		outputStream.flush();
		outputStream.close();
	}
}
