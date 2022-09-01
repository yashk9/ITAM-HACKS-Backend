package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Hotfix_Table;
import com.example.demo.repository.HotFix_Table_Repository;

@Service
public class HotFixTableServiceImplementation implements HotFixTableService {

	@Autowired
	private HotFix_Table_Repository hotfixRepo;

	@Override
	public List<Hotfix_Table> getAllHotFixTable() {
		// TODO Auto-generated method stub
		return hotfixRepo.findAll();
	}
	
}
