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
		System.out.printf("First animal is: %s \n",dog.getClass());
		Animal cat = mammalFactory.getAnimal(Constants.Animals.Mammals.Cat);
		System.out.printf("Second mammal animal with the %d nr of legs \n",cat.getNrOfLegs());
		SpeciesFactory insectFactory = abstractFactory.getSpeciesFactory(Constants.Species.Insects);
		Butterfly butterfly = (Butterfly) insectFactory.getAnimal(Constants.Animals.Insects.Butterfly);
		System.out.printf("First insect is beutiful? %b \n",butterfly.getBeautiful());
		SpeciesFactory reptileFactory = abstractFactory.getSpeciesFactory(Constants.Species.Reptiles);
		Reptile snake = (Reptile)reptileFactory.getAnimal(Constants.Animals.Reptiles.Snake);
		System.out.printf("The first reptile is ugly? %b\n", snake.getisUgly());
		SpeciesFactory birdFactory = abstractFactory.getSpeciesFactory(Constants.Species.Birds);
		Animal eagle = birdFactory.getAnimal(Constants.Animals.Birds.Eagle);
		System.out.printf("The next animal has %d  legs \n", eagle.getNrOfLegs());
		SpeciesFactory aquaticFactory = abstractFactory.getSpeciesFactory(Constants.Species.Aquatics);
		Animal seal  = aquaticFactory.getAnimal(Constants.Animals.Aquatics.Seal);
		System.out.printf("Next animal is : %s \n", seal.getClass());
		
		}

}
