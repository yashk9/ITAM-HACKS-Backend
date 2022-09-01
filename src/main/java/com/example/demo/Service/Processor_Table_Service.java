package com.example.demo.Service;

import java.util.List;

import com.example.demo.model.Processor_Table;

public interface Processor_Table_Service {

	public List<Processor_Table> getAllProcessorTable();
	public Processor_Table getProInfoByBios(String BiosSeralNumber);
}
