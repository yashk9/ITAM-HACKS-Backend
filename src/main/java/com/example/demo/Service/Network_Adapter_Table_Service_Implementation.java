package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Network_Adapter_Table;
import com.example.demo.repository.Network_Adapter_Table_Repository;

@Service
public class Network_Adapter_Table_Service_Implementation implements Network_Adapter_Table_Service{

	@Autowired
	private Network_Adapter_Table_Repository netRepo;
	@Override
	public List<Network_Adapter_Table> getAllNetworkAdapterTable() {
		// TODO Auto-generated method stub
		return netRepo.findAll();
	}
	@Override
	public List<Network_Adapter_Table> getNetBios(String BiosSeralNumber) {
		// TODO Auto-generated method stub
		return netRepo.findAllByBiosSeralNumber(BiosSeralNumber);
	}

}
