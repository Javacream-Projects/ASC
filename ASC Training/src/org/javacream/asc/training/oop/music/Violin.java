package org.javacream.asc.training.oop.music;

public class Violin extends Instrument {

	
	@Override
	public String makeSound() {
		return makeNoise();
	}

	public String makeNoise(){
		return "Fidel fadel";
	}
}
