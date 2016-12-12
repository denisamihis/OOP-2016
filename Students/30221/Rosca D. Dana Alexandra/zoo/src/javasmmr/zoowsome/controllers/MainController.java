package javasmmr.zoowsome.controllers;

import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.services.factories.AnimalsFactory;
import javasmmr.zoowsome.services.factories.Constants;
import javasmmr.zoowsome.services.factories.SpeciesFactory;

public class MainController {
	public static void main(String[] args) throws Throwable{
		AnimalsFactory abstractFactory = new AnimalsFactory();
		SpeciesFactory speciesFactory1 =abstractFactory.getSpeciesFactory(Constants.Species.Mammals);
		Animal a1 = speciesFactory1.getAnimal(Constants.Animals.Mammal.Cow);
		System.out.printf("We have an animal with %d legs!\n",a1.getNrLegs());
		}
	}

