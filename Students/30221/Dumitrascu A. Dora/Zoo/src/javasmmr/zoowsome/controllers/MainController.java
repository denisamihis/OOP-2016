package javasmmr.zoowsome.controllers;
import javasmmr.zoowsome.services.factories.*;
import javasmmr.zoowsome.services.factories.Constants.*;
import javasmmr.zoowsome.models.animals.*;

public class MainController {
	public static void main(String[] args) {
		AnimalFactory abstractFactory = new AnimalFactory();
		SpeciesFactory speciesFactory1 = abstractFactory.getSpeciesFactory(Constants.Species.Mammal);
		Animals a1 = speciesFactory1.getAnimal(Constants.Animals.Mammal.Cow);
		System.out.printf("We have an animal with %d legs!\n", a1.getNrOfLegs());
		}
}
