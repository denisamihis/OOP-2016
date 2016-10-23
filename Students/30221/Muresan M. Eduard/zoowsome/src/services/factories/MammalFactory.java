package services.factories;

import models.animals.*;

public class MammalFactory extends SpeciesFactory{
	@Override
	public Animal getAnimal(String type) throws InvalidSpeciesException
	{
		if (Constants.Animals.Mammals.Gopher.equals(type))
			return new Gopher();
		else if (Constants.Animals.Mammals.Kangaroo.equals(type))
			return new Kangaroo();
		else if (Constants.Animals.Mammals.Tiger.equals(type))
			return new Tiger();
		else
			throw new InvalidSpeciesException(type);
	}
}
