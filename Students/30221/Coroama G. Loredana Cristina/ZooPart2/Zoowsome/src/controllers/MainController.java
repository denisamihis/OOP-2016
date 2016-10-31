package controllers;
import models.animals.Animal;
/*import models.animals.Bird;
import models.employees.Caretaker;*/
import services.factories.AnimalFactory;
import services.factories.Constants;
import services.factories.SpeciesFactory;

public class MainController{
	public MainController()
	{
	
	}
public static void main(String[] args) throws Exception {

	AnimalFactory abstractFactory = new AnimalFactory();
	SpeciesFactory speciesFactory1 = abstractFactory.getSpeciesFactory(Constants.Species.Bird);
	Animal a1 = speciesFactory1.getAnimal(Constants.Animal.Bird.Owl);
	System.out.printf("We have an animal with %d legs,   !\n", a1.getNrOfLegs());
	
	
	/*for ( Caretaker c=new Caretaker();) {
		for each Animal a
		{
			AnimalFactory abstractFactory2 = new AnimalFactory();
			SpeciesFactory speciesFactory2 = abstractFactory.getSpeciesFactory(Constants.Species.Bird);
			Animal a2 = speciesFactory2.getAnimal(Constants.Animal.Bird.Owl);
			
	
		if(c.isDead()==false && a2.isTakenCareOf()==false){
		String result = c.takeCareOf(a2);
		if(result.equals(Constants.Employee.Caretaker.TCO_KILLED)){
		//declare the caretaker dead
			c.setDead(true);
		}
		else if(result.equals(Constants.Employee.Caretaker.TCO_NO_TIME)){
		//skip to the next animal, try to take care of that
		}
		else {
		a2.setTakenCareOf(true);
		}
		}
		}	
		}*/
	}
}
	


