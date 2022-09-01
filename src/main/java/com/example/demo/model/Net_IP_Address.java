package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="net_ip_address")
public class Net_IP_Address {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String IPAddress;
	private String InterfaceIndex;
	private String InterfaceAlias;
	private String AddressFamily;
	private String Type;
	private String PrefixLength;
	private String PrefixOrigin;
	private String SuffixOrigin;
	private String AddressState;
	private String ValidLifetime;
	private String PreferredLifetime;
	private String SkipAsSource;
	private String PolicyStore;
	private String biosSeralNumber;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getIPAddress() {
		return IPAddress;
	}
	public void setIPAddress(String iPAddress) {
		IPAddress = iPAddress;
	}
	public String getInterfaceIndex() {
		return InterfaceIndex;
	}
	public void setInterfaceIndex(String interfaceIndex) {
		InterfaceIndex = interfaceIndex;
	}
	public String getInterfaceAlias() {
		return InterfaceAlias;
	}
	public void setInterfaceAlias(String interfaceAlias) {
		InterfaceAlias = interfaceAlias;
	}
	public String getAddressFamily() {
		return AddressFamily;
	}
	public void setAddressFamily(String addressFamily) {
		AddressFamily = addressFamily;
	}
	public String getType() {
		return Type;
	}
	public void setType(String type) {
		Type = type;
	}
	public String getPrefixLength() {
		return PrefixLength;
	}
	public void setPrefixLength(String prefixLength) {
		PrefixLength = prefixLength;
	}
	public String getPrefixOrigin() {
		return PrefixOrigin;
	}
	public void setPrefixOrigin(String prefixOrigin) {
		PrefixOrigin = prefixOrigin;
	}
	public String getSuffixOrigin() {
		return SuffixOrigin;
	}
	public void setSuffixOrigin(String suffixOrigin) {
		SuffixOrigin = suffixOrigin;
	}
	public String getAddressState() {
		return AddressState;
	}
	public void setAddressState(String addressState) {
		AddressState = addressState;
	}
	public String getValidLifetime() {
		return ValidLifetime;
	}
	public void setValidLifetime(String validLifetime) {
		ValidLifetime = validLifetime;
	}
	public String getPreferredLifetime() {
		return PreferredLifetime;
	}
	public void setPreferredLifetime(String preferredLifetime) {
		PreferredLifetime = preferredLifetime;
	}
	public String getSkipAsSource() {
		return SkipAsSource;
	}
	public void setSkipAsSource(String skipAsSource) {
		SkipAsSource = skipAsSource;
	}
	public String getPolicyStore() {
		return PolicyStore;
	}
	public void setPolicyStore(String policyStore) {
		PolicyStore = policyStore;
	}
	public String getBiosSeralNumber() {
		return biosSeralNumber;
	}
	public void setBiosSeralNumber(String biosSeralNumber) {
		this.biosSeralNumber = biosSeralNumber;
	}
	
	
	
	
}
