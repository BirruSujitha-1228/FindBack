package com.findback.service;

import java.util.List;

import com.findback.entity.LostItem;

public interface LostItemService {

// 1. Report a new lost or found item
	LostItem createLostItem(LostItem item);

// 2. Get all reported items
	List<LostItem> getAllItems();

// 3. Get an item by ID
	LostItem getItemById(Integer id);

// 4. Update an existing item
	LostItem updateItem(Integer id, LostItem item);

// 5. Delete an item by ID
	void deleteItem(Integer id);

}
