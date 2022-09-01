package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Service.NetIdAddressService;
import com.example.demo.model.Net_IP_Address;




@CrossOrigin
@RestController
@RequestMapping("/netip")
public class NetIPAddressController {

	@Autowired
	private NetIdAddressService netIpService;
	
	@GetMapping("/getAll")
	public List<Net_IP_Address> getAllNetIPAddress(){
		return netIpService.getAllNetIPAddress();
	}
	
	@PostMapping("/add")
	public String add(@RequestBody Net_IP_Address NetIPAddress) {
		netIpService.saveNetIpAddress(NetIPAddress);
		return "New IP data added";
	}
	
	@GetMapping("/get/{BiosSeralNumber}")
	public List<Net_IP_Address> findAllByBiosSeralNumber(@PathVariable String BiosSeralNumber) {
		return netIpService.getNetInfoByBios(BiosSeralNumber);
	}
}
