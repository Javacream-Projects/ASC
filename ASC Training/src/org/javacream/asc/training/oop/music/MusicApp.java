package org.javacream.asc.training.oop.music;

public class MusicApp {

	public static void main(String[] args) {
		Band band = new Band();
		band.addSoundProvider(new Guitar());
		band.addSoundProvider(new Piano());
		//band.addInstrument(new Instrument());
		band.addSoundProvider(new Guitar());
		// TODO instrumente hinzufügen
		band.addSoundProvider(new Violin());
		band.addSoundProvider(new Drum());
		band.addSoundProvider(new Singer("Gaga", "Lady", 155, 'f'));
		band.concert();
	}

}
