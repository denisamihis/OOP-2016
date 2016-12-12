package controllers;

import models.animals.Animal;
import services.factories.AnimalFactory;
import services.factories.Constants;
import services.factories.SpeciesFactory;
public class MainController {

	public MainController() {

}

	public static void main(String[] args) throws Exception {
		

	
		AnimalFactory abstractFactory = new AnimalFactory();
		SpeciesFactory speciesFactory1 = abstractFactory.getSpeciesFactory(Constants.Species.Mammal);
		Animal a1 = speciesFactory1.getAnimal(Constants.Animal.Mammal.Cow);
		System.out.printf("We have an animal with "+ a1.getNrOfLegs() +" legs!\n");
		}}

