package controllers;

import models.animals.Animal;
import services.factories.AnimalFactory;
import services.factories.CaretakerFactory;
import services.factories.Constants;
import services.factories.EmployeeFactory;
import services.factories.SpeciesFactory;
public class MainController {

	public MainController() {

}

	public static void main(String[] args) throws Exception {
		

	
		AnimalFactory abstractFactory = new AnimalFactory();
		SpeciesFactory speciesFactory1 = abstractFactory.getSpeciesFactory(Constants.Species.Mammal);
		Animal a1 = speciesFactory1.getAnimal(Constants.Animal.Mammal.Cow);
		System.out.printf("We have an animal with "+ a1.getNrOfLegs() +" legs!\n");
	
		/*CaretakerFactory empFactory = new CaretakerFactory();
		EmployeeFactory employeeFactory1= empFactory.getEmployeeFactory(Constants.Employee.Caretaker);
		Employee c1=employeeFactory1.getEmployeeAbstractFactory()*/
	}
	}


