package com.mabmsa.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mabmsa.app.model.Items;
import com.mabmsa.app.repository.ItemsRepository;

@Service
public class ItemsServiceImpl implements ItemsService {

	@Autowired
	ItemsRepository itemsRepository;

	public Items saveItems(Items item) {
		return itemsRepository.save(item);
	}

	public List<Items> showItems() {
		return itemsRepository.findAll();
	}

	public long getItemCount() {
		return itemsRepository.count();
	}

	public void deleteBrand(Long itemId) {
		itemsRepository.deleteById(itemId);
	}

	public Long getItemCountByProductId(Long long1) {
		return long1;
		// TODO Auto-generated method stub
		
	}

}
