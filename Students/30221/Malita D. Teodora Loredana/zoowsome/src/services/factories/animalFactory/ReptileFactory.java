package services.factories.animalFactory;

import models.animlas.Animal;
import models.animlas.Chamameleon;
import models.animlas.Crocodile;
import models.animlas.Snake;

public class ReptileFactory extends SpeciesFactory {
	@Override 
	public Animal getAnimal(String type) throws InvalidSpeciesException
	{
		if (Constants.Animals.Reptiles.Chamameleon.equals(type)) 
			return new Chamameleon(); 
		else if (Constants.Animals.Reptiles.Crocodile.equals(type)) 	
			return new Crocodile();
		else if (Constants.Animals.Reptiles.Snake.equals(type))
			return new Snake();
		else 
			throw new InvalidSpeciesException(type);

	}

}
