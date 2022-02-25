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
import org.springframework.web.servlet.ModelAndView;

import com.mabmsa.app.model.Orders;
import com.mabmsa.app.service.impl.OrderServiceImpl;

@Controller
public class OrderController {

	Logger logger = LogManager.getLogger(OrderController.class);
	@Autowired
	private OrderServiceImpl orderService;

	public OrderController(OrderServiceImpl orderService) {
		super();
		this.orderService = orderService;
	}

	@GetMapping(value = "/getOrder")
	public Optional<Orders> getOrderById(Long Id, Model model) {
		logger.info("Enter into BrandController getBrandById method");
		return orderService.getOrder(Id);
	}

	@GetMapping("order")
	public ModelAndView showBrands() {
		ModelAndView mav = new ModelAndView("brand");
		List<Orders> brandsList = orderService.showOrders();
		mav.addObject("brands", brandsList);
		return mav;
	}

	@RequestMapping(value = "/saveOrder", method = { RequestMethod.POST, RequestMethod.PUT, RequestMethod.GET })
	public String saveOrder(@ModelAttribute("order") Orders order) {
		orderService.saveOrder(order);
		return "redirect:/registration?success";

	}

}
