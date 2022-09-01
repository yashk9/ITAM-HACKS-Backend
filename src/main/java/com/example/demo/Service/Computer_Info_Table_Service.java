package com.example.demo.Service;

import java.util.List;

import com.example.demo.model.Computer_Info_Table;

public interface Computer_Info_Table_Service {

	public List<Computer_Info_Table> getAllComputerInfoTable();
	public Computer_Info_Table getInfoByBiosSN(String BiosSeralNumber);
}
