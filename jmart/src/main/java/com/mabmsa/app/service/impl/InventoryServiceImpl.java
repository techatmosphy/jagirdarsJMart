package com.mabmsa.app.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mabmsa.app.model.Inventory;
import com.mabmsa.app.repository.InventoryRepository;
import com.mabmsa.app.service.InventoryService;

@Service
public class InventoryServiceImpl implements InventoryService {

	@Autowired
	private InventoryRepository InventoryRepository;

	@Override
	public List<Inventory> showInventory() {
		return InventoryRepository.findAll();
	}

	public Optional<Inventory> getInventory(Long id) {
		return InventoryRepository.findById(id);

	}

}
