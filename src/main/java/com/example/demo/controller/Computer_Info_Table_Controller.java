package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Service.Computer_Info_Table_Service;
import com.example.demo.model.Computer_Info_Table;

@CrossOrigin
@RestController
@RequestMapping("/compInfo")
public class Computer_Info_Table_Controller {

	@Autowired
	private Computer_Info_Table_Service compServ;
	
	@GetMapping("/getAll")
	public List<Computer_Info_Table> getAllComputerInfoTable(){
		return compServ.getAllComputerInfoTable();
	}
	
	@GetMapping("/get/{BiosSeralNumber}")
	public Computer_Info_Table findByBiosSeralNumber(@PathVariable String BiosSeralNumber){
		return compServ.getInfoByBiosSN(BiosSeralNumber);
	}
}
