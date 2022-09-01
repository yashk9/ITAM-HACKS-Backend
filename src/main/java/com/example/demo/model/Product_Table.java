package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Product_Table")
public class Product_Table {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Id;
	private String IdentifyingNumber;
	private String Name;
	private String Vendor;
	private String Version;
	private String Caption;
	private String BiosSeralNumber;
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getIdentifyingNumber() {
		return IdentifyingNumber;
	}
	public void setIdentifyingNumber(String identifyingNumber) {
		IdentifyingNumber = identifyingNumber;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getVendor() {
		return Vendor;
	}
	public void setVendor(String vendor) {
		Vendor = vendor;
	}
	public String getVersion() {
		return Version;
	}
	public void setVersion(String version) {
		Version = version;
	}
	public String getCaption() {
		return Caption;
	}
	public void setCaption(String caption) {
		Caption = caption;
	}
	public String getBiosSeralNumber() {
		return BiosSeralNumber;
	}
	public void setBiosSeralNumber(String biosSeralNumber) {
		BiosSeralNumber = biosSeralNumber;
	}
	
	
}
