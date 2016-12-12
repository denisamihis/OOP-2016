package javasmmr.zoowsome.controllers;
import javasmmr.zoowsome.services.factories.*;
import javasmmr.zoowsome.models.animals.*;

public class MainController {
	public static void main(String[] args) throws Exception{
		AnimalFactory abstractFactory = new AnimalFactory();
		/*SpeciesFactory speciesFactory1 = abstractFactory.getSpeciesFactory(Constants.Species.Mammal);
		Animal a1 = speciesFactory1.getAnimal(Constants.Animals.Mammals.Cow);
		Animal a2 = speciesFactory1.getAnimal(Constants.Animals.Mammals.Monkey);
		//System.out.printf("We have an animal with %d legs!\n", a1.getNrOfLegs());
		//System.out.printf("We have an animal with %d legs!\n", a2.getNrOfLegs());
		
		
		SpeciesFactory speciesFactory2 = abstractFactory.getSpeciesFactory(Constants.Species.Reptile);
		Animal b1 = speciesFactory2.getAnimal(Constants.Animals.Reptiles.Chameleon);
		//System.out.print(b1.getName());
		System.out.print("Does the "+b1.getName()+" lay eggs?\n"+"Answer:"+((Chameleon)b1).getLaysEggs()+"\n");*/
		SpeciesFactory SF3 = abstractFactory.getSpeciesFactory(Constants.Species.Aquatic);
		Animal whale1 = SF3.getAnimal(Constants.Animals.Aquatics.Whale);
		System.out.print(whale1.kill()+" "+whale1.dangerPerc);
		
	}
		
	
	/*Note to self:Must make type-cast when calling method from subclasses
	 * of Animal! -> this way the methods for the species
	 * will be visible in the MainController
	 */
}
