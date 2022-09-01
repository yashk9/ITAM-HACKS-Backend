package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Volume_Table;

@Repository
public interface Volume_Table_Repository extends JpaRepository<Volume_Table,Integer> {

	List<Volume_Table> findAllByBiosSeralNumber(String biosSeralNumber);

	

}
