package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Computer_Info_Table;
import com.example.demo.repository.Computer_Info_Table_Repository;

@Service
public class Computer_Info_Table_Service_Implementation implements Computer_Info_Table_Service{

	@Autowired
	private Computer_Info_Table_Repository compRepo;
	@Override
	public List<Computer_Info_Table> getAllComputerInfoTable() {
		// TODO Auto-generated method stub
		return compRepo.findAll();
	}
	@Override
	public Computer_Info_Table getInfoByBiosSN(String BiosSeralNumber) {
		// TODO Auto-generated method stub
		return compRepo.findByBiosSeralNumber(BiosSeralNumber);
	}
	
}
