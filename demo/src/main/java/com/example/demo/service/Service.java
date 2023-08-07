package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.model.Item;
import com.example.demo.repository.ItemRepository;


@org.springframework.stereotype.Service
public class Service {
	
	@Autowired
	private ItemRepository itemRepository;
	
	public Item create(Item item) {
		
		itemRepository.save(item);
		return item;
		
		
	}

}
