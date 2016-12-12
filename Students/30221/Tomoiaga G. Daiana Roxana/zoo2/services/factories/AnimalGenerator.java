package javasmmr.zoowsome.services.factories;


import java.util.Random;

import javasmmr.zoowsome.models.animals.Animal;

public class AnimalGenerator {

	public static Animal getAnimal() throws Exception{
		
		Random random = new Random();
		
		String [] species = {Constants.Species.Mammals, Constants.Species.Reptiles, Constants.Species.Insects, Constants.Species.Birds, Constants.Species.Aquatics};
		
		String[][] animals = { 				
			{ Constants.Animals.Mammals.Tiger, Constants.Animals.Mammals.Monkey, Constants.Animals.Mammals.Cow },
			{ Constants.Animals.Reptiles.Snake, Constants.Animals.Reptiles.Turtle, Constants.Animals.Reptiles.Chameleon },
			{ Constants.Animals.Insects.Butterfly, Constants.Animals.Insects.Spider, Constants.Animals.Insects.Cockroach },
			{ Constants.Animals.Birds.Colibri, Constants.Animals.Birds.Pigeon, Constants.Animals.Birds.Vulture },
			{ Constants.Animals.Aquatics.Salmon, Constants.Animals.Aquatics.Whale, Constants.Animals.Aquatics.Dolphin } };	 	
	
	
		int speciesRandom = random.nextInt(species.length);
		int animalsRandom = random.nextInt(animals[0].length);
		
		AnimalFactory abstractFactory = new AnimalFactory();
		SpeciesFactory speciesFactory = abstractFactory.getSpeciesFactory(species[speciesRandom]);
		Animal a = speciesFactory.getAnimal(animals[speciesRandom][animalsRandom]);
		
		return a;
		

}
}
