package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Process_Table")
public class Process_Table {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Id;
	private String Handles;
	private String NPM;
	private String PM;
	private String WS;
	private String CPU;
	private String Pid;
	private String SI;
	private String ProcessName;
	private String BiosSeralNumber;
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getHandles() {
		return Handles;
	}
	public void setHandles(String handles) {
		Handles = handles;
	}
	public String getNPM() {
		return NPM;
	}
	public void setNPM(String nPM) {
		NPM = nPM;
	}
	public String getPM() {
		return PM;
	}
	public void setPM(String pM) {
		PM = pM;
	}
	public String getWS() {
		return WS;
	}
	public void setWS(String wS) {
		WS = wS;
	}
	public String getCPU() {
		return CPU;
	}
	public void setCPU(String cPU) {
		CPU = cPU;
	}
	public String getPid() {
		return Pid;
	}
	public void setPid(String pid) {
		Pid = pid;
	}
	public String getSI() {
		return SI;
	}
	public void setSI(String sI) {
		SI = sI;
	}
	public String getProcessName() {
		return ProcessName;
	}
	public void setProcessName(String processName) {
		ProcessName = processName;
	}
	public String getBiosSeralNumber() {
		return BiosSeralNumber;
	}
	public void setBiosSeralNumber(String biosSeralNumber) {
		BiosSeralNumber = biosSeralNumber;
	}
	
}
