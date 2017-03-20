package org.javacream.asc.training.oop;

public class Person {

	private String lastname;
	private String givenName;
	private Integer height;
	private Character gender;
	private Person partner;
	private Address address;
	
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String sayHello() {
		String message = "Hello, my name is " + this.givenName + " " + this.lastname;
		if (this.partner != null) {
			message = message + ", married with " + partner.givenName + " " + partner.lastname;
		}else{
			message += ", single";
		}
		return message;
	}

	public Boolean marry(Person newPartner){
		if (newPartner != null && newPartner.partner == null && this.partner == null && this != newPartner){
			this.partner = newPartner;
			newPartner.partner = this;
			return true;
		}else{
			return false;
		}
	}
	
	public Boolean divorce(){
		if (this.partner == null){
			return false;
		}else{
			this.partner.partner = null;
			this.partner = null;
			return true;
		}
	}
	public Person(String lastname, String givenName, Integer height, Character gender) {
		super();
		this.lastname = lastname;
		this.givenName = givenName;
		this.height = height;
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Person [lastname=" + lastname + ", givenName=" + givenName + ", height=" + height + ", gender=" + gender
				+ "]";
	}

	public Person(String givenName, Integer height, Character gender) {
		super();
		this.givenName = givenName;
		this.height = height;
		this.gender = gender;
	}

	public String getLastname() {
		return this.lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getGivenName() {
		return givenName;
	}

	public Integer getHeight() {
		return height;
	}

	public Character getGender() {
		return gender;
	}
}
