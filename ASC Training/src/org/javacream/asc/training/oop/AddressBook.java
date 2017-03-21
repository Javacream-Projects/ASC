package org.javacream.asc.training.oop;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AddressBook {


	private Map<Address, List<Person>> addressMap;
	
	{
		addressMap = new HashMap<>();
	}
	
	public void add(Person p){
		Address a = p.getAddress();
		List<Person> atAddress = addressMap.get(a);
		if (atAddress == null){
			atAddress = new ArrayList<>();
			addressMap.put(a, atAddress);
		}
		atAddress.add(p);
	}
	
	public List<Person> findByAddress(Address address){
		return addressMap.get(address);
	}
}
