package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Service.Certificates_Table_Service;
import com.example.demo.model.Certificates_Table;

@CrossOrigin
@RestController
@RequestMapping("/certTable")
public class Certificates_Table_Controller {

	@Autowired
	private Certificates_Table_Service certTableService;
	
	@GetMapping("/getAll")
	public List<Certificates_Table> getAllCertificatesTable()
	{
		return certTableService.getAllCertificatesTable();
	}
	
}
