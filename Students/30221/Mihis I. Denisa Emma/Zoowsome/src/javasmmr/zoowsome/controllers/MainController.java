package javasmmr.zoowsome.controllers;

import javasmmr.zoowsome.services.factories.AnimalFactory;

public class MainController {
	public static void main(String[] args){
		AnimalFactory abstractFactory=new AnimalFactory();
		SpeciesFactory speciesFactory1=abstractFactory.getSpeciesFactory(Constants.Species.Mammals);
		Animal a1=SpeciesFactory1.getAnimal(Constants.Animals.Mammals.Lion);
		System.Out.printf("We have animal with %d lwgs!\n",a1.getNrOfLegs());
	}

}
