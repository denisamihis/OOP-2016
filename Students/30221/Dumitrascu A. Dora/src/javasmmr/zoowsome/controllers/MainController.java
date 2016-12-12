package javasmmr.zoowsome.controllers;
import javasmmr.zoowsome.services.factories.*;
import javasmmr.zoowsome.models.animals.*;

public class MainController {
	public static void main(String[] args) throws Exception{
		AnimalFactory abstractFactory = new AnimalFactory();
		SpeciesFactory speciesFactory1 = abstractFactory.getSpeciesFactory(Constants.Species.Mammal);
		Animals a1 = speciesFactory1.getAnimal(Constants.Animal.Mammal.Cow);
		/* soooo
		 * Animals (plural) is my class and the in the constant class
		 * I put Animal in the singular (i mixed up)
		 */
		Animals a2 = speciesFactory1.getAnimal(Constants.Animal.Mammal.Monkey);
		System.out.printf("We have an animal with %d legs!\n", a1.getNrOfLegs());
		System.out.printf("We have an animal with %d legs!\n", a2.getNrOfLegs());
		
		SpeciesFactory speciesFactory2 = abstractFactory.getSpeciesFactory(Constants.Species.Reptile);
		Animals b1 = speciesFactory2.getAnimal(Constants.Animal.Reptiles.Chameleon);
		
		}
}
