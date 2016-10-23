package javasmmr.zoowsome.controllers;

import java.util.*;
import javasmmr.zoowsome.models.animals.*;
import javasmmr.zoowsome.services.factories.*;

public class MainController {

	public static void main(String[] args) throws Exception {

		// Twist 1
		Random random = new Random();
		String[] species = { Constants.Species.Mammals, Constants.Species.Reptiles, Constants.Species.Insects,
				Constants.Species.Birds, Constants.Species.Aquatics };
		String[][] animals = { 
				{ Constants.Animals.Mammals.Tiger, Constants.Animals.Mammals.Monkey, Constants.Animals.Mammals.Cow }, 
				{ Constants.Animals.Reptiles.Snake, Constants.Animals.Reptiles.Turtle, Constants.Animals.Reptiles.Lizard },
				{ Constants.Animals.Insects.Butterfly, Constants.Animals.Insects.Spider, Constants.Animals.Insects.Cockroach }, 
				{ Constants.Animals.Birds.Penguin, Constants.Animals.Birds.Ostrich, Constants.Animals.Birds.Vulture },
				{ Constants.Animals.Aquatics.Octopus, Constants.Animals.Aquatics.Shark, Constants.Animals.Aquatics.Seahorse } };

		for (int i = 0; i < 50; i++) {
			int speciesRandom = random.nextInt(5);
			int animalsRandom = random.nextInt(3);

			AnimalFactory abstractFactory = new AnimalFactory();
			SpeciesFactory speciesFactory = abstractFactory.getSpeciesFactory(species[speciesRandom]);
			Animal a = speciesFactory.getAnimal(animals[speciesRandom][animalsRandom]);
			System.out.println(a.getName());
		}

	}

}
