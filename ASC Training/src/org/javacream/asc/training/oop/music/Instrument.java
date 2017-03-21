package org.javacream.asc.training.oop.music;

public abstract class Instrument implements SoundProvider {

	/* (non-Javadoc)
	 * @see org.javacream.asc.training.oop.music.SoundProvider#makeSound()
	 */
	@Override
	public abstract String makeSound();
	
	
}
