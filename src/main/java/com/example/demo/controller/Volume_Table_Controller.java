package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Service.Volume_Table_Service;
import com.example.demo.model.Volume_Table;

@CrossOrigin
@RestController
@RequestMapping("/volumeTable")
public class Volume_Table_Controller {

	@Autowired
	private Volume_Table_Service volServ;
	
	@GetMapping("/getAll")
	public List<Volume_Table> getAllVolumeTable(){
		return volServ.getAllVolumeTable();
	}
	
	@GetMapping("get/{BiosSeralNumber}")
	public List<Volume_Table> findAllByBiosSeralNumber(@PathVariable String BiosSeralNumber) {
		return volServ.getAllVolByBios(BiosSeralNumber);
	}
}
