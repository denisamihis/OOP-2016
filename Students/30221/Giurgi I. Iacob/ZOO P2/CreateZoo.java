package javasmmr.zoowsome.controllers;

import java.util.Random;

import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.services.factories.AnimalFactory;
import javasmmr.zoowsome.services.factories.Constants;
import javasmmr.zoowsome.services.factories.SpeciesFactory;

public class CreateZoo {
	  public CreateZoo(){
		  
	  }
	
	
      public Animal [] Create(int dim){
    	Animal [] zoo = new Animal[dim];
    	String[] species = { Constants.Species.Mammals, Constants.Species.Reptiles, Constants.Species.Insects,Constants.Species.Birds, Constants.Species.Aquatics };
   		String[][] animals = { 
   				 				{ Constants.Animals.Mammals.Tiger, Constants.Animals.Mammals.Monkey, Constants.Animals.Mammals.Cow }, 
   								{ Constants.Animals.Reptiles.Snake, Constants.Animals.Reptiles.Seaturtle, Constants.Animals.Reptiles.Lizard },
   				 				{ Constants.Animals.Insects.Butterfly, Constants.Animals.Insects.Spider, Constants.Animals.Insects.Cockroach }, 
   								{ Constants.Animals.Birds.Woodpecker, Constants.Animals.Birds.Ostrich, Constants.Animals.Birds.Vulture },
   				 			{ Constants.Animals.Aquatics.Whale, Constants.Animals.Aquatics.Shark, Constants.Animals.Aquatics.FishFresh } };
   	    Random r1= new Random();
	    for(int i=0;i<dim;i++){
		int speciesR=r1.nextInt(5);
		int animalR = r1.nextInt(3);
		AnimalFactory randomFactory = new AnimalFactory();
		SpeciesFactory speciesrandomFactory = randomFactory.getSpeciesFactory(species[speciesR]);
		Animal randomAnimal = speciesrandomFactory.getAnimal(animals[speciesR][animalR]);
		zoo[i] = randomAnimal;
	    }
	    return zoo;
       }
	
	
}
