package org.javacream.asc.training.oop;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Company implements Addressable{

	private String name;
	private List<Address> addresses;
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
	
	public List<Address> getAddresses(){
		return Collections.unmodifiableList(this.addresses);
		//return this.addresses;
	}
	

//	public void setAddresses(ArrayList<Address> addresses) {
//		this.addresses = new ArrayList<>(addresses);
//	}

	public String getName() {
		return name;
	}

	@Override
	public Address getAddress() {
		return addresses.get(0);
	}

	@Override
	public String toString() {
		return "Company [name=" + name + "]";
	}
}
