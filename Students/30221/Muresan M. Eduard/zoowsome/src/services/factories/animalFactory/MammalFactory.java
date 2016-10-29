package services.factories.animalFactory;

import models.animals.*;
import services.NameGenerator;
import services.factories.Constants;

public class MammalFactory extends SpeciesFactory{
	@Override
	public Animal getAnimal(String type) throws InvalidSpeciesException
	{
		if (Constants.Animals.Mammals.Gopher.equals(type))
			return new Gopher(NameGenerator.GetRandomName());
		else if (Constants.Animals.Mammals.Kangaroo.equals(type))
			return new Kangaroo(NameGenerator.GetRandomName(), "Macropus Antilopinus");
		else if (Constants.Animals.Mammals.Tiger.equals(type))
			return new Tiger(NameGenerator.GetRandomName(), "Siberian Tiger");
		else
			throw new InvalidSpeciesException(type);
	}
}
