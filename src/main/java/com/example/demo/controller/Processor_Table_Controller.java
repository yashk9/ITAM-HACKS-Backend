package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Service.Processor_Table_Service;
import com.example.demo.model.Processor_Table;

@CrossOrigin
@RestController
@RequestMapping("/processorTable")
public class Processor_Table_Controller {

	@Autowired
	private Processor_Table_Service procServ;
	
	@GetMapping("/getAll")
	public List<Processor_Table> getAllProcessorTable(){
		return procServ.getAllProcessorTable();
	}
	
	@GetMapping("/get/{BiosSeralNumber}")
	public Processor_Table findByBiosSeralNumber(@PathVariable String BiosSeralNumber) {
		return procServ.getProInfoByBios(BiosSeralNumber);
	}
	
}
