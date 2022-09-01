package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Network_Adapter_Table")
public class Network_Adapter_Table {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Id;
	private String Description;
	private String MacAddress;
	private String biosSeralNumber;
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public String getMacAddress() {
		return MacAddress;
	}
	public void setMacAddress(String macAddress) {
		MacAddress = macAddress;
	}
	public String getBiosSeralNumber() {
		return biosSeralNumber;
	}
	public void setBiosSeralNumber(String biosSeralNumber) {
		this.biosSeralNumber = biosSeralNumber;
	}
	
	
}
