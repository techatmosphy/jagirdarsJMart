package com.mabmsa.app.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mabmsa.app.model.Orders;
import com.mabmsa.app.service.OrderService;

@Service
public class OrderServiceImpl implements OrderService {

	@Autowired
	private OrderRepository orderRepository;

	public Orders saveOrder(Orders order) {
		return orderRepository.save(order);

	}

	public Optional<Orders> getOrder(Long id) {
		return orderRepository.findById(id);

	}

	@Override
	public List<Orders> showOrders() {
		return orderRepository.findAll();
	}

}
