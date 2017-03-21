package org.javacream.asc.training.oop.music;

import java.util.ArrayList;
import java.util.List;

public class Band {
	private List<SoundProvider> soundProviders;
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
