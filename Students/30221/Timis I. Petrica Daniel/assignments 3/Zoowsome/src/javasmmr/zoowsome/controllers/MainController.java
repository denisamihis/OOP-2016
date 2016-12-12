package javasmmr.zoowsome.controllers;

import java.util.*;

import javasmmr.zoowsome.models.animals.Animal;
// import javasmmr.zoowsome.services.factories.Constants;
import javasmmr.zoowsome.services.factories.AnimalFactory;
import javasmmr.zoowsome.services.factories.SpeciesFactory;

public class MainController {

	public static void main(String[] args) throws Exception {
		
		// Twist 1
		Random random = new Random();
		String[] species = { "Mammals", "Reptiles", "Insects", "Birds", "Aquatics" };
		String[][] animals = { { "TIGER", "MONKEY", "COW" }, { "SNAKE", "TURTLE", "LIZARD" },
				{ "BUTTERFLY", "SPIDER", "COCKROACH" }, { "PENGUIN", "OSTRICH", "VULTURE" },
				{ "OCTOPUS", "SHARK", "SEAHORSE" } };
		
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
