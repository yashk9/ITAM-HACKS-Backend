package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Network_Adapter_Table;

@Repository
public interface Network_Adapter_Table_Repository extends JpaRepository<Network_Adapter_Table,Integer>{

	List<Network_Adapter_Table> findAllByBiosSeralNumber(String biosSeralNumber);

}
