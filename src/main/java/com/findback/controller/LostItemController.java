package com.findback.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.findback.entity.LostItem;
import com.findback.service.LostItemService;

@RestController
public class LostItemController {
	private final LostItemService lostItemService;

	public LostItemController(LostItemService lostItemService) {
		this.lostItemService = lostItemService;
	}

	// http://localhost:1228/items
	@PostMapping("/items")
	public LostItem createLostItem(@RequestBody LostItem item) {
		return lostItemService.createLostItem(item);

	}

	@GetMapping("/items")
	public List<LostItem> getAllItems() {
		return lostItemService.getAllItems();
	}

	@GetMapping("/items/{id}")
	public LostItem getbyId(@PathVariable Integer id) {
		return lostItemService.getItemById(id);

	}
	
	@PutMapping("/items/{id}")
	public LostItem updateItem(@PathVariable Integer id,@RequestBody LostItem item) {
		return lostItemService.updateItem(id,item);
	}
	
	@DeleteMapping("/items/{id}")
	public String deleteItem(@PathVariable Integer id) {
		lostItemService.deleteItem(id);
		return "Item deleted Succesfully";
	}

}
