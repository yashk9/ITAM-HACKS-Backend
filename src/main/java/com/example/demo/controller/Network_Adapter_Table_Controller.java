package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Service.Network_Adapter_Table_Service;
import com.example.demo.model.Network_Adapter_Table;

@CrossOrigin
@RestController
@RequestMapping("/netAdapter")
public class Network_Adapter_Table_Controller {

	@Autowired
	private Network_Adapter_Table_Service netServ;
	
	@GetMapping("/getAll")
	public List<Network_Adapter_Table> getAllNetworkAdapterTable(){
		return netServ.getAllNetworkAdapterTable();
	}
	
	@GetMapping("/get/{BiosSeralNumber}")
	public List<Network_Adapter_Table> findAllByBiosSeralNumber(@PathVariable String BiosSeralNumber) {
		return netServ.getNetBios(BiosSeralNumber);
	}
}
