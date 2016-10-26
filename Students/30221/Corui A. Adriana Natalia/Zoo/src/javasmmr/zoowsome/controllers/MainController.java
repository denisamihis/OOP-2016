package javasmmr.zoowsome.controllers;

import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.services.factories.AnimalFactory;
import javasmmr.zoowsome.services.factories.Constants;
import javasmmr.zoowsome.services.factories.SpeciesFactory;

public class MainController {

	public static void main(String []args)
	{
		AnimalFactory abstractFactory=new AnimalFactory();
		Animal animal1=null;
		SpeciesFactory speciesFactory1=null;
		try
		{
			speciesFactory1=abstractFactory.getSpeciesFactory(Constants.Species.Aquatics);
			animal1=speciesFactory1.getAnimal(Constants.Animals.Aquatics.Dolphin);
			System.out.printf("We have an animal with %d legs!\n", animal1.getNrOfLegs());

		}
		catch(Exception e)
		{
			System.out.println("Error");
		}
	}
}
