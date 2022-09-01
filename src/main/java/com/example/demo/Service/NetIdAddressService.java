package com.example.demo.Service;

import java.util.List;

import com.example.demo.model.Net_IP_Address;


public interface NetIdAddressService {
	
	public Net_IP_Address saveNetIpAddress(Net_IP_Address NetIpAddress);
	public List<Net_IP_Address> getAllNetIPAddress();
	
	public List<Net_IP_Address> getNetInfoByBios(String BiosSeralNumber);

}
