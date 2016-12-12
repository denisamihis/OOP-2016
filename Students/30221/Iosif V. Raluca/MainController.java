package javasmmr.zoowsome.controllers;
import javasmmr.zoowsome.services.factories.Constants;
import javasmmr.zoowsome.services.factories.SpeciesFactory;



import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.services.factories.AnimalFactory;

public class MainController {

	public static void main(String[] args){
		
		AnimalFactory abstractFactory= new AnimalFactory();
		SpeciesFactory spiecesFactory1=abstractFactory.getSpeciesFactory(Constants.Species.Mammals);
		Animal a1= spiecesFactory1.getAnimal(Constants.Animals.Mammals.Cow);
		System.out.printf("We have an animal with %d legs!\n", a1.getNrOfLegs());
		
		
		
		
					
	}
}
