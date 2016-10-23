package services.factories;

import models.animals.*;

public class ReptileFactory extends SpeciesFactory{
	@Override
	public Animal getAnimal(String type) throws InvalidSpeciesException
	{
		if (Constants.Animals.Reptiles.Aligator.equals(type))
			return new Aligator();
		else if (Constants.Animals.Reptiles.Iguana.equals(type))
			return new Iguana();
		else if (Constants.Animals.Reptiles.KomodoDragon.equals(type))
			return new KomodoDragon();
		else
			throw new InvalidSpeciesException(type);
	}
}