package javasmmr.zoowsome.services.factories.animals;

import java.util.Random;

import javasmmr.zoowsome.models.animals.Animal;

public class AnimalGenerator {
	public static Animal getAnimal() throws Throwable {
		Random random = new Random();
		
 		String[] species = { Constants.Species.Mammals, Constants.Species.Reptiles, Constants.Species.Insects,
 				Constants.Species.Birds, Constants.Species.Aquatics };
 		
		String[][] animals = { 
 				{ Constants.Animals.Mammals.Tiger, Constants.Animals.Mammals.Monkey, Constants.Animals.Mammals.Cow },
		 		{ Constants.Animals.Reptiles.Snake, Constants.Animals.Reptiles.Turtle, Constants.Animals.Reptiles.Lizard },
		 		{ Constants.Animals.Insects.Butterfly, Constants.Animals.Insects.Spider, Constants.Animals.Insects.Cockroach },
		 		{ Constants.Animals.Birds.Eagle, Constants.Animals.Birds.Owl, Constants.Animals.Birds.Chicken },
		 		{ Constants.Animals.Aquatics.Dolphin, Constants.Animals.Aquatics.Shark, Constants.Animals.Aquatics.Whale } };
		 		
		int speciesRandom = random.nextInt(species.length);
 		int animalsRandom = random.nextInt(animals[0].length);
		 		
		AnimalFactory animalFactory = new AnimalFactory();
		SpeciesFactory speciesFactory = animalFactory.getSpeciesFactory(species[speciesRandom]);
		
		Animal animal = speciesFactory.getAnimal(animals[speciesRandom][animalsRandom]); 		
		return animal;
 	}
}
