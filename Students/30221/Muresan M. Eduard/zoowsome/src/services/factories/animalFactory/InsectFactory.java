package services.factories.animalFactory;

import java.util.Random;
import models.animals.*;
import services.NameGenerator;
import services.factories.Constants;

public class InsectFactory extends SpeciesFactory{
	@Override
	public Animal getAnimal(String type) throws InvalidSpeciesException
	{
		Random rand = new Random();
		if (Constants.Animals.Insects.FireAnt.equals(type))
			return new FireAnt(NameGenerator.GetRandomName());
		else if (Constants.Animals.Insects.Snail.equals(type))
			return new Snail(NameGenerator.GetRandomName(), 1 + rand.nextInt(10));
		else if (Constants.Animals.Insects.StagBeetle.equals(type))
			return new StagBeetle(NameGenerator.GetRandomName(), 1 +rand.nextInt(5));
		else
			throw new InvalidSpeciesException(type);
	}
}
