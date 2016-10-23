package controllers;

import models.animlas.*;
import models.animlas.Butterfly;
import models.animlas.Insect;
import services.factories.AnimalFactory;
import services.factories.Constants;
import services.factories.InvalidSpeciesException;
import services.factories.SpeciesFactory;

public class MainController {

	public static void main(String[] args) throws InvalidSpeciesException {
		AnimalFactory abstractFactory = new AnimalFactory();
		SpeciesFactory mammalFactory = abstractFactory.getSpeciesFactory(Constants.Species.Mammals);
		Animal dog =mammalFactory.getAnimal(Constants.Animals.Mammals.Dog);
		System.out.printf("First animal with the scientific name: %s \n",dog.getSN());
		Animal cat = mammalFactory.getAnimal(Constants.Animals.Mammals.Cat);
		System.out.printf("Second mammal animal with the scientific name: %s \n",cat.getSN());
		SpeciesFactory insectFactory = abstractFactory.getSpeciesFactory(Constants.Species.Insects);
		Butterfly butterfly = (Butterfly) insectFactory.getAnimal(Constants.Animals.Insects.Butterfly);
		System.out.printf("First insect is beutiful? %b \n",butterfly.getBeautiful());
		SpeciesFactory reptileFactory = abstractFactory.getSpeciesFactory(Constants.Species.Reptiles);
		Reptile snake = (Reptile)reptileFactory.getAnimal(Constants.Animals.Reptiles.Snake);
		System.out.printf("The first reptile is ugly? %b\n", snake.getisUgly());
		SpeciesFactory birdFactory = abstractFactory.getSpeciesFactory(Constants.Species.Birds);
		Animal eagle = birdFactory.getAnimal(Constants.Animals.Birds.Eagle);
		System.out.printf("Scientific name of the eagle is: %s  \n", eagle.getSN());
		SpeciesFactory aquaticFactory = abstractFactory.getSpeciesFactory(Constants.Species.Aquatics);
		Animal seal  = aquaticFactory.getAnimal(Constants.Animals.Aquatics.Seal);
		System.out.printf("The scientific name of the seal is : %s \n", seal.getSN());
		
		}

}
