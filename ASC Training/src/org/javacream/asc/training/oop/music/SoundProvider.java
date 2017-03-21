package org.javacream.asc.training.oop.music;

public interface SoundProvider {

	String makeSound();

	// Compiliert erst ab Java 8
	default public String makeSound(Volume volume) {
		switch (volume) {
		case MAX: {
			return makeSound().toUpperCase();
		}
		case NORMAL: {
			return makeSound();
		}
		case MIN: {
			return makeSound().toLowerCase();
		}
		default: {
			return makeSound();
		}
		}
		
		
	}
}