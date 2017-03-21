package org.javacream.asc.training.oop.music;

import org.javacream.asc.training.oop.Person;

public class Singer extends Person implements SoundProvider {

	public Singer(String lastname, String givenName, Integer height, Character gender) {
		super(lastname, givenName, height, gender);
	}

	public Singer(String givenName, Integer height, Character gender) {
		super(givenName, height, gender);
	}

	@Override
	public String makeSound() {
		return "Tralala";
	}

}
