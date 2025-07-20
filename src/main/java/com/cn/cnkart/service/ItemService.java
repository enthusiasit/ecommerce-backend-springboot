package com.cn.cnkart.service;

import com.cn.cnkart.dal.ItemDALImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cn.cnkart.entity.Item;

import javax.transaction.Transactional;

@Service
public class ItemService {

	@Autowired
	ItemDALImpl itemDAL;

	@Transactional
	public Item getItemById(int id) {
		return itemDAL.getItemById(id);
	}

	@Transactional
	public void saveItem(Item item) {
		itemDAL.saveItem(item);
	}

	@Transactional
	public void deleteItem(int id) {
		itemDAL.deleteItem(id);
	}

	@Transactional
	public void updateItem(Item updatedItem) {
		itemDAL.updateItem(updatedItem);
	}
}
