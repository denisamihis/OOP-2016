package javasmmr.zoowsome.services.factories;

import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.models.animals.Duck;
import javasmmr.zoowsome.models.animals.Owl;
import javasmmr.zoowsome.models.animals.Pigeon;

public class BirdFactory extends SpeciesFactory {

	public Animal getAnimal(String type) throws Exception
	{
		if(Constants.Animals.Birds.Duck.equals(type))
			return new Duck();
		else
			if(Constants.Animals.Birds.Owl.equals(type))
				return new Owl();
			else
				if(Constants.Animals.Birds.Pigeon.equals(type))
					return new Pigeon();
				else
					System.out.println("Invalid animal exception");
		throw new Exception("Invalid animal provided.");
	}
}
