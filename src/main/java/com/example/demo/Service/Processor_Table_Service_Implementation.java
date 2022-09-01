package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Processor_Table;
import com.example.demo.repository.Processor_Table_Repository;

@Service
public class Processor_Table_Service_Implementation implements Processor_Table_Service{

	@Autowired
	private Processor_Table_Repository procRepo;
	
	@Override
	public List<Processor_Table> getAllProcessorTable() {
		// TODO Auto-generated method stub
		return procRepo.findAll();
	}

	@Override
	public Processor_Table getProInfoByBios(String BiosSeralNumber) {
		// TODO Auto-generated method stub
		return procRepo.findByBiosSeralNumber(BiosSeralNumber);
	}
 
}
