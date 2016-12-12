package controllers;

import models.animals.Animal;
import services.factories.*;
public class MainController{
	public static void main (String args[]) throws Exception{
		AnimalFactory abstractfactory = new AnimalFactory();
		SpeciesFactory speciesFactory1 = abstractfactory.getSpeciesFactory(Constants.Species.Mammals);
		Animal a1= speciesFactory1.getAnimal(Constants.Animals.Mammals.Cow);
		System.out.printf("We have an animal with %d legs", a1.getNrOfLegs());
	}
}