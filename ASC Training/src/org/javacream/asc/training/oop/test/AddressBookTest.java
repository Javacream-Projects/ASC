package org.javacream.asc.training.oop.test;

import java.util.List;

import org.javacream.asc.books.api.Publisher;
import org.javacream.asc.training.oop.Address;
import org.javacream.asc.training.oop.AddressBook;
import org.javacream.asc.training.oop.Addressable;
import org.javacream.asc.training.oop.Company;
import org.javacream.asc.training.oop.Person;
import org.junit.Test;

public class AddressBookTest {

@Test public void testAddressBook(){
	AddressBook ab = new AddressBook();
	Person p1 = new Person("Sawitzki", "Klaus", 181, 'm');
	Person p2 = new Person("Sawitzki", "Alexandra", 181, 'f');
	Person p3 = new Person("Mustermann", "Klaus", 181, 'm');
	Address a1 = new Address("München", "Marienplatz");
	Address a2 = new Address("München", "Karlsplatz");
	Publisher publisher = new Publisher("Springer", a1);
	p1.setAddress(a1);
	p2.setAddress(a1);
	p3.setAddress(a2);
	ab.add(p1);
	ab.add(p2);
	ab.add(p3);
	ab.add(publisher);
	
	Company company = new Company("Integrata", a2);
	ab.add(company);
//	System.out.println(ab.findByAddress(a1));
//	System.out.println(ab.findByAddress(a2));
	List<Addressable> result = ab.findByAddress(a1);
	for (Addressable a: result){
		System.out.println(a.getName());
	}
}
}
