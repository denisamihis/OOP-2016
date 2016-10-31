package services.factories.animalFactory;

import java.awt.Color;
import java.util.Random;
import models.animals.*;
import services.NameGenerator;
import services.factories.Constants;

public class BirdFactory extends SpeciesFactory{
	@Override
	public Animal getAnimal(String type) throws InvalidSpeciesException
	{
		Random rand = new Random();
		if (Constants.Animals.Birds.Duck.equals(type))
			return new Duck(NameGenerator.GetRandomName(), Color.GREEN);
		else if (Constants.Animals.Birds.Flamingo.equals(type))
			return new Flamingo(NameGenerator.GetRandomName(), "Greater Flamingo");
		else if (Constants.Animals.Birds.Ostrich.equals(type))
			return new Ostrich(NameGenerator.GetRandomName(), rand.nextBoolean());
		else
			throw new InvalidSpeciesException(type);
	}
}