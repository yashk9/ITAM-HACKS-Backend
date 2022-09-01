package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Service.Product_Table_Service;
import com.example.demo.model.Product_Table;

@CrossOrigin
@RestController
@RequestMapping("/productTable")
public class Product_Table_Controller {

	@Autowired
	private Product_Table_Service prodServ;
	
	@GetMapping("/getAll")
	public List<Product_Table> getAllProductTable(){
		return prodServ.getAllProductTable();
	}
}
