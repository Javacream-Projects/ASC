package org.javacream.asc.training.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

import org.junit.Assert;
import org.junit.Test;

public class CollectionsTests {

	@Test public void testList(){
		System.out.println("########## testList ########## ");
		//ArrayList of String
		ArrayList<String> names = new ArrayList<>();
		names.add("Hugo");
		names.add("Emil");
		names.add("Hugo");
		Assert.assertTrue(names.size() == 3);
		Assert.assertEquals("Hugo", names.get(0));
		for (String name: names){
			System.out.println(name);
		}
		
	}
	@Test public void testSet(){
		System.out.println("########## testSet ########## ");
		//HashSet of String
		HashSet<String> names = new HashSet<>();
		names.add("Hugo");
		names.add("Emil");
		names.add("Hugo");
		Assert.assertTrue(names.size() == 2);
		//Assert.assertEquals("Hugo", names.get(0));
		for (String name: names){
			System.out.println(name);
		}
		
		Assert.assertTrue(names.contains("Hugo"));
		Assert.assertFalse(names.contains("Fritz"));
		
	}
	
	@Test public void testMap(){
		System.out.println("########## testMap ########## ");
		HashMap<Integer, String> postalCodes = new HashMap<>();
		postalCodes.put(80678, "München");
		postalCodes.put(80679, "München");
		postalCodes.put(30001, "Berlin");
		Assert.assertTrue(postalCodes.size() == 3);
		
		Assert.assertTrue(postalCodes.containsKey(80678));
		Assert.assertFalse(postalCodes.containsKey(55555));
		
		for (Integer plz : postalCodes.keySet()){
			System.out.println(plz);
		}
		for (String city : postalCodes.values()){
			System.out.println(city);
		}
		for (Integer plz : postalCodes.keySet()){
			System.out.println(plz + "=" + postalCodes.get(plz));
		}
	}
}
