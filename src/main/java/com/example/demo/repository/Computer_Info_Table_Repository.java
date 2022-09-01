package com.example.demo.repository;

//import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.example.demo.model.Computer_Info_Table;

@Repository
public interface Computer_Info_Table_Repository extends JpaRepository<Computer_Info_Table,Integer>{

	//@Query(value = "select * from computer_info where biosSeralNumber=:value", nativeQuery=true)
	Computer_Info_Table findByBiosSeralNumber(String BiosSeralNumber);
	
	

}