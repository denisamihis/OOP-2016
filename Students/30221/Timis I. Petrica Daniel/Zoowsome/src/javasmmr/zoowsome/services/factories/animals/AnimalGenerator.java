package javasmmr.zoowsome.services.factories.animals;

import javasmmr.zoowsome.models.animals.*;
import javasmmr.zoowsome.services.factories.constants.*;
import java.util.*;

public class AnimalGenerator {
	
	public static Animal getAnimal() throws Exception {
		Random random = new Random();

		String[] species = { Constants.Species.MAMMALS, Constants.Species.REPTILES, Constants.Species.INSECTS,
				Constants.Species.BIRDS, Constants.Species.AQUATICS };
		String[][] animals = { 
				{ Constants.Animals.Mammals.TIGER, Constants.Animals.Mammals.MONKEY, Constants.Animals.Mammals.COW },
				{ Constants.Animals.Reptiles.SNAKE, Constants.Animals.Reptiles.TURTLE, Constants.Animals.Reptiles.LIZARD },
				{ Constants.Animals.Insects.BUTTERFLY, Constants.Animals.Insects.SPIDER, Constants.Animals.Insects.COCKROACH },
				{ Constants.Animals.Birds.PENGUIN, Constants.Animals.Birds.OSTRICH, Constants.Animals.Birds.VULTURE },
				{ Constants.Animals.Aquatics.OCTOPUS, Constants.Animals.Aquatics.SHARK, Constants.Animals.Aquatics.SEAHORSE } };
		
		int speciesRandom = random.nextInt(species.length);
		int animalsRandom = random.nextInt(animals[0].length);
		
		AnimalFactory abstractFactory = new AnimalFactory();
		SpeciesFactory speciesFactory = abstractFactory.getSpeciesFactory(species[speciesRandom]);
		Animal a = speciesFactory.getAnimal(animals[speciesRandom][animalsRandom]);
		
		return a;
	}
	
}
