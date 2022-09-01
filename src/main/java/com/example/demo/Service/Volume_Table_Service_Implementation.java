package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Volume_Table;
import com.example.demo.repository.Volume_Table_Repository;

@Service
public class Volume_Table_Service_Implementation implements Volume_Table_Service {

	@Autowired
	private Volume_Table_Repository volTableRepo;
	
	@Override
	public List<Volume_Table> getAllVolumeTable() {
		// TODO Auto-generated method stub
		return volTableRepo.findAll();
	}

	@Override
	public List<Volume_Table> getAllVolByBios(String BiosSeralNumber) {
		// TODO Auto-generated method stub
		return volTableRepo.findAllByBiosSeralNumber(BiosSeralNumber);
	}

}
