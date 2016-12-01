package javasmmr.zoowsome.controllers;


import java.util.ArrayList;

import javasmmr.zoowsome.models.animals.*;
import javasmmr.zoowsome.models.employees.*;
import javasmmr.zoowsome.repositories.AnimalRepository;
import javasmmr.zoowsome.repositories.EmployeeRepository;
import javasmmr.zoowsome.services.factories.animals.*;
import javasmmr.zoowsome.services.factories.employees.*;

public class MainController {
	
	public static void main(String[] args) throws Throwable {
	 		
		EmployeeAbstractFactory employeeAbstractFactory = new EmployeeAbstractFactory();
		EmployeeFactory employeeFactory = employeeAbstractFactory.getEmployeeFactory(Constants.Employees.Caretaker);
		
		final int NR_CARETAKERS = 20;
		final int NR_ANIMALS = 20;
		
		ArrayList<Caretaker> caretaker1 = new ArrayList<>();
		ArrayList<Animal> animal1 = new ArrayList<>();
		ArrayList<Employees> employees = new ArrayList<>();
		
		for (int i = 0; i < NR_CARETAKERS; i++) {
			Employees auxEmployee = employeeFactory.getEmployees(Constants.Employees.Caretaker);
			caretaker1.add((Caretaker) auxEmployee);
			employees.add(auxEmployee);
		}
		
		EmployeeRepository er = new EmployeeRepository();
		er.save(employees);
		 
		for (int i = 0; i < NR_ANIMALS; i++) {
		 	animal1.add(AnimalGenerator.getAnimal());
 		}
		
		AnimalRepository ar = new AnimalRepository();
		ar.save(animal1);
		
		String results;
		for (Caretaker c : caretaker1) {
		 	for (Animal a : animal1) {
		 		if (c.getIsDead()==false && a.getTakenCareOf()==false) {
		 			results = c.takeCareOf(a);
		 			if (results.equals(Constants.Employees.Caretakers.TCO_KILLED)) {
		 					System.out.println(c.getName() +" has been killed by the "+ a.getName());
		 					c.setIsDead(true);
		 			} else 
		 				if (results.equals(Constants.Employees.Caretakers.TCO_NO_TIME)) {
		 					System.out.println(c.getName()+ " doesn't have enough time to take care of the " + a.getName());
		 					continue;
		 				} else {
		 						a.setTakenCareOf(true);
		 						System.out.println(a.getName() + " has been taken care of by " + c.getName());
		  				}
		  		}
		 	}
		}
		
		
	}
}
