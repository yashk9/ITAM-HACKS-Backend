package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Service.Process_Table_Service;
import com.example.demo.model.Process_Table;

@CrossOrigin
@RestController
@RequestMapping("/processTable")
public class Process_Table_Controller {

	@Autowired
	private Process_Table_Service procServ;
	
	@GetMapping("/getAll")
	public List<Process_Table> getAllProcessTable(){
		return procServ.getAllProcessTable();
	}
}
