package javasmmr.zoowsome.controllers;


import javasmmr.zoowsome.models.animals.*;
import javasmmr.zoowsome.models.employees.*;
import javasmmr.zoowsome.services.factories.animals.*;
import javasmmr.zoowsome.services.factories.employees.*;

public class MainController {
	
	public static void main(String[] args) throws Throwable {
	 		
		Caretaker[] caretaker = new Caretaker[50];
		Animal[] animal = new Animal[50];
	 		
		EmployeeAbstractFactory employeeAbstractFactory = new EmployeeAbstractFactory();
		EmployeeFactory employeeFactory = employeeAbstractFactory.getEmployeeFactory(Constants.Employees.Caretaker);
	 		
		for(int i = 0; i < caretaker.length; i++) {
			caretaker[i] = (Caretaker)employeeFactory.getEmployees(Constants.Employees.Caretaker);
		}
	 		
		for(int i = 0; i < animal.length; i++) {
			animal[i] = AnimalGenerator.getAnimal();
		}
	 	
		String result;
		for(int i = 0; i < caretaker.length; i++) {
			for(int j = 0; j < animal.length; j++) {
				if(caretaker[i].getIsDead()==false && animal[j].getTakenCareOf()==false) {
						result = caretaker[i].takeCareOf(animal[j]);
	 					if(result.equals(Constants.Employees.Caretakers.TCO_KILLED)) {
	 						caretaker[i].setIsDead(true);
	 						System.out.println(caretaker[i].getName() + " has been killed by the " + animal[j].getName());
	 					} 
	 					else
	 						if(result.equals(Constants.Employees.Caretakers.TCO_NO_TIME)) {
	 							System.out.println(caretaker[i].getName() + " doesn't have enough time to take care of the " + animal[j].getName());
	 							continue;
	 						}
	 						else {
	 							animal[j].setTakenCareOf(true);
	 							System.out.println(animal[j].getName() + " has been taken care of by " + caretaker[i].getName());
	 						}
				}
			}
		}	
	}
}
