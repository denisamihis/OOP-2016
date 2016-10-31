package javasmmr.zoowsome.services.factories.animals;

import javasmmr.zoowsome.models.animals.*;
import javasmmr.zoowsome.services.factories.constants.*;
import java.util.*;

public class AnimalGenerator {
	
	public static Animal getAnimal() throws Exception {
		Random random = new Random();

		String[] species = { Constants.Species.Mammals, Constants.Species.Reptiles, Constants.Species.Insects,
				Constants.Species.Birds, Constants.Species.Aquatics };
		String[][] animals = { 
				{ Constants.Animals.Mammals.Tiger, Constants.Animals.Mammals.Monkey, Constants.Animals.Mammals.Cow },
				{ Constants.Animals.Reptiles.Snake, Constants.Animals.Reptiles.Turtle, Constants.Animals.Reptiles.Lizard },
				{ Constants.Animals.Insects.Butterfly, Constants.Animals.Insects.Spider, Constants.Animals.Insects.Cockroach },
				{ Constants.Animals.Birds.Penguin, Constants.Animals.Birds.Ostrich, Constants.Animals.Birds.Vulture },
				{ Constants.Animals.Aquatics.Octopus, Constants.Animals.Aquatics.Shark, Constants.Animals.Aquatics.Seahorse } };
		
		int speciesRandom = random.nextInt(species.length);
		int animalsRandom = random.nextInt(animals[0].length);
		
		AnimalFactory abstractFactory = new AnimalFactory();
		SpeciesFactory speciesFactory = abstractFactory.getSpeciesFactory(species[speciesRandom]);
		Animal a = speciesFactory.getAnimal(animals[speciesRandom][animalsRandom]);
		
		return a;
	}
	
}
