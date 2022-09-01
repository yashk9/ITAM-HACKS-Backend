package com.example.demo.Service;

import java.util.List;

import com.example.demo.model.Network_Adapter_Table;

public interface Network_Adapter_Table_Service {

	public List<Network_Adapter_Table> getAllNetworkAdapterTable();
	public List<Network_Adapter_Table> getNetBios(String BiosSeralNumber);
}
