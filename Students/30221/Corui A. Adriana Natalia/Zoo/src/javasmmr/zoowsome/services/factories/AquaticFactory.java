package javasmmr.zoowsome.services.factories;

import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.models.animals.Dolphin;
import javasmmr.zoowsome.models.animals.Jellyfish;
import javasmmr.zoowsome.models.animals.Shark;

public class AquaticFactory extends SpeciesFactory{

	public Animal getAnimal(String type) throws Exception
	{
		
			if(Constants.Animals.Aquatics.Dolphin.equals(type))
				return new Dolphin(0.1,0.1);
			else
				if(Constants.Animals.Aquatics.Jellyfish.equals(type))
					return new Jellyfish(0.2,0.1);
				else
					if(Constants.Animals.Aquatics.Shark.equals(type))
						return new Shark(0.1,0.1);
		
			throw new Exception("Invalid animal provided.");
				
		
	}
}
