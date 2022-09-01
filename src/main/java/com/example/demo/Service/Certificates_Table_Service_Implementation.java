package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Certificates_Table;
import com.example.demo.repository.Certificates_Table_Repository;

@Service
public class Certificates_Table_Service_Implementation implements  Certificates_Table_Service{

	@Autowired
	private Certificates_Table_Repository certTableRepo;
	
	@Override
	public List<Certificates_Table> getAllCertificatesTable() {
		// TODO Auto-generated method stub
		return certTableRepo.findAll();
	}

}
