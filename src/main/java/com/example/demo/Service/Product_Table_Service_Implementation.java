package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Product_Table;
import com.example.demo.repository.Product_Table_Repository;

@Service
public class Product_Table_Service_Implementation implements Product_Table_Service{

	@Autowired
	private Product_Table_Repository prodTableRepo;
	
	@Override
	public List<Product_Table> getAllProductTable() {
		// TODO Auto-generated method stub
		return prodTableRepo.findAll();
	}

}
