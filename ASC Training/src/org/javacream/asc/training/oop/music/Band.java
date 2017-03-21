package org.javacream.asc.training.oop.music;

import java.util.ArrayList;

public class Band {
	ArrayList<SoundProvider> soundProviders;
	{
		soundProviders = new ArrayList<>();
	}
	
	public void addSoundProvider(SoundProvider soundProvider){
		soundProviders.add(soundProvider);
	}

	public void concert(){
		for (SoundProvider soundProvider : soundProviders){
			System.out.println(soundProvider.makeSound(Volume.MIN));
		}
	}
	
}
