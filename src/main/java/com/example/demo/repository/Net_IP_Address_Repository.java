package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Net_IP_Address;

@Repository
public interface Net_IP_Address_Repository extends JpaRepository<Net_IP_Address,Integer> {

	

	List<Net_IP_Address> findAllByBiosSeralNumber(String biosSeralNumber);

}
