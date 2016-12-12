package javasmmr.zoowsome.controllers;


import java.util.ArrayList;
import java.util.Random;

import javax.xml.stream.XMLStreamException;

import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.repositories.AnimalRepository;
import javasmmr.zoowsome.services.factories.AnimalFactory;
import javasmmr.zoowsome.services.factories.Constants;
import javasmmr.zoowsome.services.factories.SpeciesFactory;

public class CreateZoo {
	  public CreateZoo(){
		  
	  }
	
	
      public Animal [] Create(int dim) throws Exception, XMLStreamException{
    	Animal [] zoo = new Animal[dim];
    	ArrayList<Animal> array = new ArrayList<Animal>();
		AnimalRepository database_animals = new AnimalRepository();
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
		array.add(randomAnimal);
	    }
	    database_animals.save(array);
	    return zoo;
       }
	
	
}
