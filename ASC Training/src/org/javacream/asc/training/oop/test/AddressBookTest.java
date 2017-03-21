package org.javacream.asc.training.oop.test;

import org.javacream.asc.training.oop.Address;
import org.javacream.asc.training.oop.AddressBook;
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
	p1.setAddress(a1);
	p2.setAddress(a1);
	p3.setAddress(a2);
	ab.add(p1);
	ab.add(p2);
	ab.add(p3);
	System.out.println(ab.findByAddress(a1));
	System.out.println(ab.findByAddress(a2));
}
}
