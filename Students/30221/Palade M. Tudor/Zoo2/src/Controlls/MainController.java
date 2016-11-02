package Controlls;
import models.animals.*;
import services.factories.*;

public class MainController {

public static void main(String args[]) throws Exception{
	AnimalFactory abstractFactory = new AnimalFactory();
	
	SpeciesFactory speciesFactory1 = abstractFactory.getSpeciesFactory(Constants.Species.Mammals);
		animals a1 = speciesFactory1.getAnimal(Constants.Animals.Mammals.Monkey);
		System.out.printf("We have an animal with  %d legs!\n", a1.getNrOfLegs());
}
}