package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Service.HotFixTableService;
import com.example.demo.model.Hotfix_Table;




@CrossOrigin
@RestController
@RequestMapping("/hotfix")
public class HotFixTableController {

	@Autowired
	private HotFixTableService hotfixService;
	
	@GetMapping("/getAll")
	public List<Hotfix_Table> getAllHotFixTable(){
		return hotfixService.getAllHotFixTable();
	}
	
	
}
