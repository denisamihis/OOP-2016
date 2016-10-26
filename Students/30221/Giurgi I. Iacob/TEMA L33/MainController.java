package javasmmr.zoowsome.controllers;

import javasmmr.zoowsome.services.factories.Constants;
import javasmmr.zoowsome.services.factories.SpeciesFactory;

import java.util.*;

import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.services.factories.AnimalFactory;

// MAIN + TWIST NUMBER ONE;

public class MainController {
	public static void main(String[] args ) {
	
		String[] species = { Constants.Species.Mammals, Constants.Species.Reptiles, Constants.Species.Insects,Constants.Species.Birds, Constants.Species.Aquatics };
		String[][] animals = { 
				 				{ Constants.Animals.Mammals.Tiger, Constants.Animals.Mammals.Monkey, Constants.Animals.Mammals.Cow }, 
								{ Constants.Animals.Reptiles.Snake, Constants.Animals.Reptiles.Seaturtle, Constants.Animals.Reptiles.Lizard },
				 				{ Constants.Animals.Insects.Butterfly, Constants.Animals.Insects.Spider, Constants.Animals.Insects.Cockroach }, 
								{ Constants.Animals.Birds.Woodpecker, Constants.Animals.Birds.Ostrich, Constants.Animals.Birds.Vulture },
				 			{ Constants.Animals.Aquatics.Whale, Constants.Animals.Aquatics.Shark, Constants.Animals.Aquatics.FishFresh } };
		
	   Random r1= new Random();
	   for(int i=0;i<36;i++){
		int speciesR=r1.nextInt(5);
		int animalR = r1.nextInt(3);
		AnimalFactory randomFactory = new AnimalFactory();
		SpeciesFactory speciesrandomFactory = randomFactory.getSpeciesFactory(species[speciesR]);
		Animal randomAnimal = speciesrandomFactory.getAnimal(animals[speciesR][animalR]);
		System.out.println("Animalul ales random este "+randomAnimal.getName() + " si are " +randomAnimal.getNrOfLegs() + " legs");
	   }
	
	
	
	}	
	
}
