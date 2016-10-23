package services.factories;

import models.animals.*;

public class BirdFactory extends SpeciesFactory{
	@Override
	public Animal getAnimal(String type) throws InvalidSpeciesException
	{
		if (Constants.Animals.Birds.Duck.equals(type))
			return new Duck();
		else if (Constants.Animals.Birds.Flamingo.equals(type))
			return new Flamingo();
		else if (Constants.Animals.Birds.Ostrich.equals(type))
			return new Ostrich();
		else
			throw new InvalidSpeciesException(type);
	}
}