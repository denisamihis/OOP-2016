package javasmmr.zoowsome.controllers;

import java.util.ArrayList;

import javasmmr.zoowsome.models.animals.*;
import javasmmr.zoowsome.models.employees.*;
import javasmmr.zoowsome.repositories.*;
import javasmmr.zoowsome.services.factories.animals.*;
import javasmmr.zoowsome.services.factories.constants.*;
import javasmmr.zoowsome.services.factories.employees.*;

public class MainController {

	public static void main(String[] args) throws Exception {
		
		final int NR_OF_CARETAKERS = 10;
		final int NR_OF_ANIMALS = 10;

		ArrayList<Caretaker> caretaker = new ArrayList<>();
		ArrayList<Animal> animal = new ArrayList<>();
		ArrayList<Employee> employee = new ArrayList<>();

		EmployeeAbstractFactory employeeAbstractFactory = new EmployeeAbstractFactory();
		EmployeeFactory employeeFactory = employeeAbstractFactory.getEmployeeFactory(Constants.Employees.CARETAKER);

		for (int i = 0; i < NR_OF_CARETAKERS; i++) {
			Employee auxEmployee = employeeFactory.getEmployee(Constants.Employees.CARETAKER);
			caretaker.add((Caretaker) auxEmployee);
			employee.add(auxEmployee);
		}

		EmployeeRepository er = new EmployeeRepository();
		er.save(employee);

		for (int i = 0; i < NR_OF_ANIMALS; i++) {
			animal.add(AnimalGenerator.getAnimal());
		}

		AnimalRepository ar = new AnimalRepository();
		ar.save(animal);

		for (Caretaker c : caretaker) {
			for (Animal a : animal) {
				if (!c.getIsDead() && !a.getTakenCareOf()) {
					String result = c.takeCareOf(a);
					if (result.equals(Constants.Employees.Caretakers.TCO_KILLED)) {
						System.out.println(c.getName() + "[ID: " + c.getId() + "]" + " has been killed by the "
								+ a.getName() + ".");
						c.setIsDead(true);
					} else if (result.equals(Constants.Employees.Caretakers.TCO_NO_TIME)) {
						System.out.println(c.getName() + "[ID: " + c.getId() + "]"
								+ " hasn't got enough time to take care of the " + a.getName() + ".");
						continue;
					} else {
						a.setTakenCareOf(true);
						System.out.println(a.getName() + " has been taken care of by " + c.getName() + "[ID: "
								+ c.getId() + "]" + ".");
					}
				}
			}
		}

	}
}
