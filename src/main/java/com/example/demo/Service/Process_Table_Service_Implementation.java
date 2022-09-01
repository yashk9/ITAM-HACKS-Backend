package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Process_Table;
import com.example.demo.repository.Process_Table_Repository;

@Service
public class Process_Table_Service_Implementation implements Process_Table_Service{

	@Autowired
	private Process_Table_Repository procTableRepo;
	
	@Override
	public List<Process_Table> getAllProcessTable() {
		// TODO Auto-generated method stub
		return procTableRepo.findAll();
	}

}
