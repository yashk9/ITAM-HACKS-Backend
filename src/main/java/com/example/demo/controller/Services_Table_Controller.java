package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Service.Services_Table_Service;
import com.example.demo.model.Services_Table;

@CrossOrigin
@RestController
@RequestMapping("/serviceTable")
public class Services_Table_Controller {

	@Autowired
	private Services_Table_Service servTableService;
	
	@GetMapping("/getAll")
	public List<Services_Table> getAllServicesTable(){
		return servTableService.getAllServicesTable();
	}
}
