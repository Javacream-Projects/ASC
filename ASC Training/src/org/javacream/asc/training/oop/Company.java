package org.javacream.asc.training.oop;

import java.util.ArrayList;

public class Company {

	private String name;
	private ArrayList<Address> addresses;
	public Company(String name, Address address) {
		super();
		this.name = name;
		this.addresses = new ArrayList<>();
		this.addresses.add(address);
	}
	
	public void addAddress(Address address){
		if (address != null && !this.addresses.contains(address)){
			this.addresses.add(address);
		}
	}
	

	public void removeAddress(Integer index ){
		if (index > 0 && index < this.addresses.size()){
			this.addresses.remove(index.intValue());
		}
	}
	
	public ArrayList<Address> getAddresses(){
		return new ArrayList<>(this.addresses);
	}

//	public void setAddresses(ArrayList<Address> addresses) {
//		this.addresses = new ArrayList<>(addresses);
//	}

	public String getName() {
		return name;
	}
}
