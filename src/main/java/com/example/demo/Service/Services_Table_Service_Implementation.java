package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Services_Table;
import com.example.demo.repository.Services_Table_Repository;

@Service
public class Services_Table_Service_Implementation implements Services_Table_Service {

	@Autowired
	private Services_Table_Repository servTableRepo;
	
	@Override
	public List<Services_Table> getAllServicesTable() {
		// TODO Auto-generated method stub
		return servTableRepo.findAll();
	}

}
