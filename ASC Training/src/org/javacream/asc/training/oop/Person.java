package org.javacream.asc.training.oop;

public class Person implements Addressable {

	private String lastname;
	private String givenName;
	private Integer height;
	private Character gender;
	private Person partner;
	private Address address;
	private static final Integer NUMBER_OF_EYES; //NUMBER_OF_EYES
	private static int peopleCounter;
	public static Integer getNumberOfEyes() {
		return NUMBER_OF_EYES;
	}
	//Statische Initializer/Konstruktor
	static{
		System.out.println("Initializing class Person");
		NUMBER_OF_EYES = 2;
	}
	//Default-Konstruktor, wird (zusätzlich zu einem anderen Konstruktor IMMER aufgerufen
	{
		peopleCounter = peopleCounter + 1;
		System.out.println("Actual personCounter: " + peopleCounter);
		System.out.println("Initializing object of type Person " + this);
	}

	
	/* (non-Javadoc)
	 * @see org.javacream.asc.training.oop.Addressable#getAddress()
	 */
	@Override
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

	@Override
	public String getName() {
		return givenName + " " + lastname;
	}
}
