package services.factories.animalFactory;

import java.util.Random;
import models.animals.*;
import services.NameGenerator;
import services.factories.Constants;

public class AquaticFactory extends SpeciesFactory{
	@Override
	public Aquatic getAnimal(String type) throws InvalidSpeciesException
	{
		Random rand = new Random();
		if (Constants.Animals.Aquatics.Seahorse.equals(type))
			return new Seahorse(NameGenerator.GetRandomName(), "Weedy Sea Dragon");
		else if (Constants.Animals.Aquatics.Shark.equals(type))
			return new Shark(NameGenerator.GetRandomName(),10 + rand.nextInt(70) + rand.nextDouble());
		else if (Constants.Animals.Aquatics.Stingray.equals(type))
			return new Stingray(NameGenerator.GetRandomName(), 5 + rand.nextInt(15));
		else
			throw new InvalidSpeciesException(type);
	}
}