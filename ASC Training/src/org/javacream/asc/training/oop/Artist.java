package org.javacream.asc.training.oop;

public class Artist extends Person {

	public Artist(String lastname, String givenName, Integer height, Character gender) {
		super(lastname, givenName, height, gender);
	}

	@Override
	public String sayHello() {
		return "painting, singing, ...";
	}

	public Artist(String givenName, Integer height, Character gender) {
		super(givenName, height, gender);
	}

}
