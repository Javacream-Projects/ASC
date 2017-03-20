package org.javacream.asc.training.oop;

public class Person {

	private String lastname;
	private String givenName;
	private Integer height;
	private Character gender;
	
	public String sayHello(){
		return null;
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
		return lastname;
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
