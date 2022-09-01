package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Processor_Table")
public class Processor_Table {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Id;
	private String Caption;
	private String DeviceID;          
	private String Manufacturer;      
	private String MaxClockSpeed;     
	private String Name;              
	private String SocketDesignation; 
	private String biosSeralNumber;
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getCaption() {
		return Caption;
	}
	public void setCaption(String caption) {
		Caption = caption;
	}
	public String getDeviceID() {
		return DeviceID;
	}
	public void setDeviceID(String deviceID) {
		DeviceID = deviceID;
	}
	public String getManufacturer() {
		return Manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		Manufacturer = manufacturer;
	}
	public String getMaxClockSpeed() {
		return MaxClockSpeed;
	}
	public void setMaxClockSpeed(String maxClockSpeed) {
		MaxClockSpeed = maxClockSpeed;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getSocketDesignation() {
		return SocketDesignation;
	}
	public void setSocketDesignation(String socketDesignation) {
		SocketDesignation = socketDesignation;
	}
	public String getBiosSeralNumber() {
		return biosSeralNumber;
	}
	public void setBiosSeralNumber(String biosSeralNumber) {
		this.biosSeralNumber = biosSeralNumber;
	}
	
	
}
