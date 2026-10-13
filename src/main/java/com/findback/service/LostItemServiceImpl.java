package com.findback.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.findback.entity.LostItem;
import com.findback.repository.LostItemRepository;

@Service
public class LostItemServiceImpl implements LostItemService{

	
	@Autowired
	private LostItemRepository lostItemRepository;
	
	
	@Override
	public LostItem createLostItem(LostItem item) {
		
		return lostItemRepository.save(item);
	}

	@Override
	public List<LostItem> getAllItems() {
		
		return lostItemRepository.findAll();
	}

	@Override
	public LostItem getItemById(Integer id) {
		
		return lostItemRepository.findById(id).orElseThrow(()->new RuntimeException("Item not found with ID: "+id));
	}

	@Override
	public LostItem updateItem(Integer id, LostItem item) {
		
		LostItem existingItem=getItemById(id);
		
		existingItem.setItemName(item.getItemName());
		existingItem.setDescription(item.getDescription());
		existingItem.setLocation(item.getLocation());
		existingItem.setStatus(item.getStatus());
		return lostItemRepository.save(existingItem);
	}

	@Override
	public void deleteItem(Integer id) {
		LostItem existingitem=getItemById(id); 
		lostItemRepository.delete(existingitem);
		
	}

}
