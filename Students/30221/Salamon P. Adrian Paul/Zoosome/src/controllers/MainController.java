package controllers;

import models.animals.Animal;
import servicies.factory.AnimalFactory;
import servicies.factory.Constants;
import servicies.factory.SpeciesFactory;

public class MainController {

	public static void main(String[] args) throws Exception {
		AnimalFactory abstractFactory = new AnimalFactory();
		SpeciesFactory speciesFactory1 = abstractFactory.getSpeciesFactory(Constants.Species.Insects);
		Animal a1 = speciesFactory1.getAnimal(Constants.Animals.Insects.Ant);
		System.out.printf("We have an animal with %d legs!\n", a1.getNrOfLegs());

		// TODO Auto-generated method stub

	}

}
