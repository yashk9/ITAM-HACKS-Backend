package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Processor_Table;

@Repository
public interface Processor_Table_Repository extends JpaRepository<Processor_Table,Integer>{

	

	

	Processor_Table findByBiosSeralNumber(String biosSeralNumber);

}
