package com.example.demo.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Item;
import com.example.demo.service.Service;

@RestController
public class controller {
	
	@Autowired
	private Service service;
	
	@PostMapping("/_create")
	private String create(@RequestBody Item item) {
		
		service.create(item);
		return "created";
		
	}

}
