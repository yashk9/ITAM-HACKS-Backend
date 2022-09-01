package com.example.demo.Service;

import java.util.List;

import com.example.demo.model.Volume_Table;

public interface Volume_Table_Service {

	public List<Volume_Table> getAllVolumeTable();
	public List<Volume_Table> getAllVolByBios(String BiosSeralNumber);
}
