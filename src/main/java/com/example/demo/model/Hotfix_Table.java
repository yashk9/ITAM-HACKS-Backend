package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Hotfix_Table")
public class Hotfix_Table {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Id;
	private String Source;
	private String Description;
	private String HotFixId;
	private String InstalledBy;
	private String InstalledOn;
	
	private String BiosSeralNumber;

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		this.Id = id;
	}

	public String getSource() {
		return Source;
	}

	public void setSource(String source) {
		Source = source;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	public String getHotFixId() {
		return HotFixId;
	}

	public void setHotFixId(String hotFixId) {
		HotFixId = hotFixId;
	}

	public String getInstalledBy() {
		return InstalledBy;
	}

	public void setInstalledBy(String installedBy) {
		InstalledBy = installedBy;
	}

	public String getInstalledOn() {
		return InstalledOn;
	}

	public void setInstalledOn(String installedOn) {
		InstalledOn = installedOn;
	}

	public String getBiosSeralNumber() {
		return BiosSeralNumber;
	}

	public void setBiosSeralNumber(String biosSeralNumber) {
		BiosSeralNumber = biosSeralNumber;
	}
}
