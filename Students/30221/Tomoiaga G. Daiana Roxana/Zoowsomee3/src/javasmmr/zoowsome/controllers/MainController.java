package javasmmr.zoowsome.controllers;
import java.util.ArrayList;

import javasmmr.zoowsome.models.animals.*;
import javasmmr.zoowsome.models.employees.Caretaker;
import javasmmr.zoowsome.models.employees.Employee;
import javasmmr.zoowsome.repositories.AnimalRepository;
import javasmmr.zoowsome.repositories.EmployeeRepository;
import javasmmr.zoowsome.services.factories.*;

public class MainController {
	public static void main(String[] args) throws Exception {
		
		
		
		ArrayList<Animal> animal = new ArrayList<Animal>();
		ArrayList<Caretaker> caretaker = new ArrayList<Caretaker>();
		ArrayList<Employee> employee = new ArrayList<Employee>();
		
		EmployeeAbstractFactory employeeAbstractFactory = new EmployeeAbstractFactory();
		EmployeeFactory employeeFactory = employeeAbstractFactory.getEmployeeFactory(Constants.Employees.Caretaker);
		
		for(int i = 0; i < 50; i++){
			Employee auxEmployee = employeeFactory.getEmployee(Constants.Employees.Caretaker);
			caretaker.add((Caretaker) auxEmployee);
			employee.add(auxEmployee);
		}
		
		EmployeeRepository empR = new EmployeeRepository();
		empR.save(employee);

		for (int i = 0; i < 50; i++) {
			animal.add(AnimalGenerator.getAnimal());
			}
		
		AnimalRepository anmR = new AnimalRepository();
		anmR.save(animal);

		for(Caretaker c : caretaker){
			for(Animal a : animal){
				if(!c.getIsDead() && !a.getTakenCareOf()) {
					String result = c.takeCareOf(a);
					if(result.equals(Constants.Employees.Caretakers.TCO_KILLED)){
						System.out.println(c.getName() +  "[ID: " + c.getId() + "]" + " has been killed by the " + a.getName() + ".");
						c.setIsDead(true);
					} else if (result.equals(Constants.Employees.Caretakers.TCO_NO_TIME)){
						System.out.println(c.getName() + "[ID: " + c.getId() + "]" + " hasn't got enough time to take care of the " + a.getName() + ".");
						continue;
					} else {
						a.setTakenCareOf(true);
						System.out.println(a.getName() + " has been taken care of by " + c.getName() + "[ID: " + c.getId() + "]" + ".");
					}
				}
			}
		}

		
		
		
		
	}

}
