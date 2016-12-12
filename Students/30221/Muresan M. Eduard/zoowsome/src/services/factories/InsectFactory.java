package services.factories;

import models.animals.*;

public class InsectFactory extends SpeciesFactory{
	@Override
	public Animal getAnimal(String type) throws InvalidSpeciesException
	{
		if (Constants.Animals.Insects.FireAnt.equals(type))
			return new FireAnt();
		else if (Constants.Animals.Insects.Snail.equals(type))
			return new Snail();
		else if (Constants.Animals.Insects.StagBeetle.equals(type))
			return new StagBeetle();
		else
			throw new InvalidSpeciesException(type);
	}
}
