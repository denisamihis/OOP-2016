package services.factories;

import models.animals.*;

public class AquaticFactory extends SpeciesFactory{
	@Override
	public Aquatic getAnimal(String type) throws InvalidSpeciesException
	{
		if (Constants.Animals.Aquatics.Seahorse.equals(type))
			return new Seahorse();
		else if (Constants.Animals.Aquatics.Shark.equals(type))
			return new Shark();
		else if (Constants.Animals.Aquatics.Stingray.equals(type))
			return new Stingray();
		else
			throw new InvalidSpeciesException(type);
	}
}