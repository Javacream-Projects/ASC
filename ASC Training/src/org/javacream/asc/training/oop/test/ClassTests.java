package org.javacream.asc.training.oop.test;

import java.util.HashSet;

import org.javacream.asc.training.oop.Address;
import org.javacream.asc.training.oop.Company;
import org.javacream.asc.training.oop.Person;
import org.junit.Assert;
import org.junit.Test;

public class ClassTests {

	@Test
	public void personTest() {
		Person p1 = new Person("Sawitzki", "Rainer", 183, 'm');
		System.out.println(p1.toString());
		Assert.assertEquals("Sawitzki", p1.getLastname());
	}

	@Test
	public void testAddress() {
		Address a1 = new Address("München", "Marienplatz");
		System.out.println(a1.toString());
		Assert.assertEquals("München", a1.getCity());

	}

	@Test
	public void testPersonIdentity() {
		Person p1 = new Person("Sawitzki", "Klaus", 181, 'm');
		Person p2 = new Person("Sawitzki", "Rainer", 183, 'm');
		Person p3 = new Person("Sawitzki", "Rainer", 183, 'm');
		HashSet<Person> set = new HashSet<>();
		set.add(p1);
		set.add(p2);
		set.add(p3);
		Assert.assertTrue(set.size() == 3);
		System.out.println(p1.sayHello());
		System.out.println(p2.sayHello());

	}

	@Test
	public void testAddressIdentity() {
		Address a1 = new Address("München", "Marienplatz");
		Address a2 = new Address("München", "Karlsplatz");
		Address a3 = new Address("München", "Marienplatz");
		HashSet<Address> set = new HashSet<>();
		set.add(a1);
		set.add(a2);
		set.add(a3);
		Assert.assertTrue(set.size() == 2);

	}

	@Test
	public void testPersonMarriage() {
		Person p1 = new Person("Sawitzki", "Klaus", 181, 'm');
		Person p2 = new Person("Musterfrau", "Hanna", 170, 'f');
		Person p3 = new Person("Mustermann", "Hans", 199, 'm');
		
		
		Assert.assertFalse(p1.marry(p1));
		Assert.assertTrue(p1.marry(p2));
		Assert.assertFalse(p1.marry(p3));
		Assert.assertTrue(p1.divorce());
		Assert.assertFalse(p2.divorce());
		Assert.assertTrue(p2.marry(p3));
		
		
	}

	@Test public void peopleAndAddresses(){
		Person p1 = new Person("Sawitzki", "Klaus", 181, 'm');
		Person p2 = new Person("Musterfrau", "Hanna", 170, 'f');
		Person p3 = new Person("Mustermann", "Hans", 199, 'm');
		Address a1 = new Address("München", "Marienplatz");
		Address a2 = new Address("München", "Karlsplatz");

		p1.setAddress(a1);
		p2.setAddress(a1);
		p3.setAddress(a2);
		p2.setAddress(new Address("Düsseldorf", "Flughafen"));
	}
	@Test public void companyAndAddresses(){
		
		Address a1 = new Address("München", "Marienplatz");
		Address a2 = new Address("München", "Karlsplatz");
		Address a3 = new Address("Düsseldorf", "Flughafen");
		Company company = new Company("ASC", a3);
		
		Assert.assertEquals(1,company.getAddresses().size());
		company.addAddress(a2);
		company.addAddress(a1);
		company.addAddress(null);
		
		Assert.assertEquals(3,company.getAddresses().size());
		company.removeAddress(2);
		Assert.assertEquals(2,company.getAddresses().size());
		company.addAddress(a3);
		Assert.assertEquals(2,company.getAddresses().size());
		company.removeAddress(0);
		Assert.assertEquals(2,company.getAddresses().size());
		doSomethingHidden(company);
		Assert.assertEquals(2,company.getAddresses().size());
		System.out.println(Person.getNumberOfEyes());
	}
	private void doSomethingHidden(Company company) {
		company.getAddresses().clear();
	}
}
