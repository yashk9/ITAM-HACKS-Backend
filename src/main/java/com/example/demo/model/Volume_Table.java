package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Volume_Table")
public class Volume_Table {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Id;
	private String DriveLetter;
	private String FriendlyName;
	private String FileSystemType;
	private String DriveType;
	private String HealthStatus;
	private String OperationalStatus;
	private String SizeRemaining;
	private String Size;
	private String biosSeralNumber;
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getDriveLetter() {
		return DriveLetter;
	}
	public void setDriveLetter(String driveLetter) {
		DriveLetter = driveLetter;
	}
	public String getFriendlyName() {
		return FriendlyName;
	}
	public void setFriendlyName(String friendlyName) {
		FriendlyName = friendlyName;
	}
	public String getFileSystemType() {
		return FileSystemType;
	}
	public void setFileSystemType(String fileSystemType) {
		FileSystemType = fileSystemType;
	}
	public String getDriveType() {
		return DriveType;
	}
	public void setDriveType(String driveType) {
		DriveType = driveType;
	}
	public String getHealthStatus() {
		return HealthStatus;
	}
	public void setHealthStatus(String healthStatus) {
		HealthStatus = healthStatus;
	}
	public String getOperationalStatus() {
		return OperationalStatus;
	}
	public void setOperationalStatus(String operationalStatus) {
		OperationalStatus = operationalStatus;
	}
	public String getSizeRemaining() {
		return SizeRemaining;
	}
	public void setSizeRemaining(String sizeRemaining) {
		SizeRemaining = sizeRemaining;
	}
	public String getSize() {
		return Size;
	}
	public void setSize(String size) {
		Size = size;
	}
	public String getBiosSeralNumber() {
		return biosSeralNumber;
	}
	public void setBiosSeralNumber(String biosSeralNumber) {
		this.biosSeralNumber = biosSeralNumber;
	}
	
	
	
}
