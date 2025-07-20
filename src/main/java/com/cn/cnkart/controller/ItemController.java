package com.cn.cnkart.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.cn.cnkart.entity.Item;
import com.cn.cnkart.service.ItemService;

@RestController
@RequestMapping("/item")
public class ItemController {

	@Autowired
	ItemService itemService;

	@GetMapping("/id/{id}")
	public Item getItemById(@PathVariable int id){
		return itemService.getItemById(id);
	}

	@PostMapping("/create")
	public void saveItem(@RequestBody Item item){
		itemService.saveItem(item);
	}

	@DeleteMapping("/remove/{id}")
	public void deleteItem(@PathVariable int id){
		itemService.deleteItem(id);
	}

	@PutMapping("/update")
	public void updateItem(@RequestBody Item updatedItem){
		itemService.updateItem(updatedItem);
	}

}
