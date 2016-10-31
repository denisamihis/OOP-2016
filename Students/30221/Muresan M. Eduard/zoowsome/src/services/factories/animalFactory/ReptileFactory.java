package services.factories.animalFactory;

import java.util.Random;
import models.animals.*;
import services.NameGenerator;
import services.factories.Constants;

public class ReptileFactory extends SpeciesFactory{
	@Override
	public Animal getAnimal(String type) throws InvalidSpeciesException
	{
		Random rand = new Random();
		if (Constants.Animals.Reptiles.Aligator.equals(type))
			return new Aligator(NameGenerator.GetRandomName(), 10+rand.nextInt(50));
		else if (Constants.Animals.Reptiles.Iguana.equals(type))
			return new Iguana(NameGenerator.GetRandomName());
		else if (Constants.Animals.Reptiles.KomodoDragon.equals(type))
			return new KomodoDragon(NameGenerator.GetRandomName());
		else
			throw new InvalidSpeciesException(type);
	}
}