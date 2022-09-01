package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Certificates_Table")
public class Certificates_Table {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String Name;
	private String Subject;
	private String Issuer;
	private String Thumbprint;
	private String FriendlyName;
	private String NotBefore;
	private String NotAfter;
	private String Extensions;
	private String BiosSeralNumber;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getSubject() {
		return Subject;
	}
	public void setSubject(String subject) {
		Subject = subject;
	}
	public String getIssuer() {
		return Issuer;
	}
	public void setIssuer(String issuer) {
		Issuer = issuer;
	}
	public String getThumbprint() {
		return Thumbprint;
	}
	public void setThumbprint(String thumbprint) {
		Thumbprint = thumbprint;
	}
	public String getFriendlyName() {
		return FriendlyName;
	}
	public void setFriendlyName(String friendlyName) {
		FriendlyName = friendlyName;
	}
	public String getNotBefore() {
		return NotBefore;
	}
	public void setNotBefore(String notBefore) {
		NotBefore = notBefore;
	}
	public String getNotAfter() {
		return NotAfter;
	}
	public void setNotAfter(String notAfter) {
		NotAfter = notAfter;
	}
	public String getExtensions() {
		return Extensions;
	}
	public void setExtensions(String extensions) {
		Extensions = extensions;
	}
	public String getBiosSeralNumber() {
		return BiosSeralNumber;
	}
	public void setBiosSeralNumber(String biosSeralNumber) {
		BiosSeralNumber = biosSeralNumber;
	}
}
