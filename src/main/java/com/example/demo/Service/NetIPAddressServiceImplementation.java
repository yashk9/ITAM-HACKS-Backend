package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Net_IP_Address;
import com.example.demo.repository.Net_IP_Address_Repository;

@Service
public class NetIPAddressServiceImplementation implements NetIdAddressService {

	@Autowired
	private Net_IP_Address_Repository netipRepo;

	@Override
	public List<Net_IP_Address> getAllNetIPAddress() {
	
		return netipRepo.findAll();
	}

	@Override
	public Net_IP_Address saveNetIpAddress(Net_IP_Address NetIpAddress) {
		// TODO Auto-generated method stub
		return netipRepo.save(NetIpAddress);
	}

	@Override
	public List<Net_IP_Address> getNetInfoByBios(String BiosSeralNumber) {
		// TODO Auto-generated method stub
		return netipRepo.findAllByBiosSeralNumber(BiosSeralNumber);
	}
	
}
