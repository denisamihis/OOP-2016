package javasmmr.zoowsome.services.factories;

import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.models.animals.Dolphin;
import javasmmr.zoowsome.models.animals.Jellyfish;
import javasmmr.zoowsome.models.animals.Shark;

public class AquaticFactory extends SpeciesFactory{

	public Animal getAnimal(String type)
	{
		try
		{
			if(Constants.Animals.Aquatics.Dolphin.equals(type))
				return new Dolphin();
			else
				if(Constants.Animals.Aquatics.Jellyfish.equals(type))
					return new Jellyfish();
				else
					if(Constants.Animals.Aquatics.Shark.equals(type))
						return new Shark();
		}
		catch( Exception e)
		{
			System.out.println("Invalid animal exception");
		}
		return null;			
		
	}
}
