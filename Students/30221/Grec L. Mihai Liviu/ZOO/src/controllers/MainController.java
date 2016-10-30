package controllers;
import models.animals.*;
import models.employees.*;

import models.employees.*;
import services.factories.*;
import java.util.Random;
public class MainController {

	public static void main(String[] args) throws Exception {
		Random species = new Random();
		Random animal = new Random();
		int row = 0;
		int column = 0;
		AnimalFactory abstractFactory = new AnimalFactory();
		Animal[] a1 = new Animal[50];
		for (int counter = 0 ; counter<=49 ; counter++){
			
			
			row = species.nextInt(5);
			column = animal.nextInt(3);
			switch (row){
			case 0:{
				SpeciesFactory speciesFactory1 = abstractFactory.getSpeciesFactory(Constants.Species.Mammals);
				switch(column){
				case 0:{
					a1[counter] = speciesFactory1.getAnimal(Constants.Animals.Mammals.Kangaroo);
					break;
				}
				case 1:{
					a1[counter] = speciesFactory1.getAnimal(Constants.Animals.Mammals.Lion);
					break;
				}
				case 2:{
					a1[counter] = speciesFactory1.getAnimal(Constants.Animals.Mammals.Tiger);
					break;
				}
				default:{
					throw new Exception("Invalid animal exception!");
				}
				}
				break;
			
			
			}
			case 1:{
				SpeciesFactory speciesFactory1 = abstractFactory.getSpeciesFactory(Constants.Species.Aquatics);
				switch(column){
				case 0:{
					a1[counter] = speciesFactory1.getAnimal(Constants.Animals.Aquatics.Dolphin);
					break;
				}
				case 1:{
					a1[counter] = speciesFactory1.getAnimal(Constants.Animals.Aquatics.Penguin);
					break;
				}
				case 2:{
					a1[counter] = speciesFactory1.getAnimal(Constants.Animals.Aquatics.Seal);
					break;
				}
				default:{
					throw new Exception("Invalid animal exception!");
				}
				}
				break;

				
			
			}
			case 2:{
				SpeciesFactory speciesFactory1 = abstractFactory.getSpeciesFactory(Constants.Species.Birds);
				switch(column){
				case 0:{
					a1[counter] = speciesFactory1.getAnimal(Constants.Animals.Birds.Eagle);
					break;
				}
				case 1:{
					a1[counter] = speciesFactory1.getAnimal(Constants.Animals.Birds.Emu);
					break;
				}
				case 2:{
					a1[counter] = speciesFactory1.getAnimal(Constants.Animals.Birds.Peacock);
					break;
				}
				default:{
					throw new Exception("Invalid animal exception!");
				}
				}
				break;
			}
			case 3:{
				SpeciesFactory speciesFactory1 = abstractFactory.getSpeciesFactory(Constants.Species.Insects);
				switch(column){
				case 0:{
					a1[counter] = speciesFactory1.getAnimal(Constants.Animals.Insects.Butterfly);
					break;
				}
				case 1:{
					a1[counter] = speciesFactory1.getAnimal(Constants.Animals.Insects.Cockroach);
					break;
				}
				case 2:{
					a1[counter] = speciesFactory1.getAnimal(Constants.Animals.Insects.Spider);
					break;
				}
				default:{
					throw new Exception("Invalid animal exception!");
				}
				}
				break;
			}
			case 4:{
				SpeciesFactory speciesFactory1 = abstractFactory.getSpeciesFactory(Constants.Species.Reptiles);
				switch(column){
				case 0:{
					a1[counter] = speciesFactory1.getAnimal(Constants.Animals.Reptiles.Crocodile);
					break;
				}
				case 1:{
					a1[counter] = speciesFactory1.getAnimal(Constants.Animals.Reptiles.Snake);
					break;
				}
				case 2:{
					a1[counter] = speciesFactory1.getAnimal(Constants.Animals.Reptiles.Turtle);
					break;
				}
				default:{
					throw new Exception("Invalid animal exception!");
				}
				}
				break;
			}
			default:{
				throw new Exception("Invalid animal exception!");
			}
			}
			System.out.printf("Animal %d : %s \n", counter + 1, a1[counter].getName());
			if(a1[counter].kill()) System.out.println("Moare maaaaa");
		}
		EmployeeAbstractFactory test = new EmployeeAbstractFactory();
		EmployeeFactory test1 = test.getEmployeeFactory(Constants.Employee.CareTakers);
		Employee[] angajat1 = new Employee[20];
		for(int counter = 0;counter<20;counter++)
			angajat1[counter] = test1.getEmployee();
		System.out.println("Nume\tSalariu");
		for (int counter = 0;counter<10;counter++)
		System.out.println(angajat1[counter].getName() + "\t" + angajat1[counter].getSalary());
		
		System.out.println();
		String result = "";
		boolean dead , care;
		for (int employeeCounter = 0 ; employeeCounter < angajat1.length ; employeeCounter++){
			for (int animalCounter = 0 ; animalCounter < a1.length ; animalCounter++){
				dead = angajat1[employeeCounter].getIsDead();
				care = a1[animalCounter].getTakenCareOf();
				if (!dead && !care){
					result = ((CareTaker)angajat1[employeeCounter]).takeCareOf(a1[animalCounter]);
				}
				
				if (result.equals(Constants.Employees.Caretakers.TCO_KILLED)){
					angajat1[employeeCounter].setIsDead(true);
				}
				else if (result.equals(Constants.Employees.Caretakers.TCO_NO_TIME)){
					continue;
				}
				else a1[animalCounter].setTakenCareOf(true);
					
			}
		}
		for (int counter = 0;counter <a1.length ; counter++){
			care = a1[counter].getTakenCareOf();
			if (care)
				System.out.println("Animalul nr "+ counter +" a fost ingrijit");
		
		else 
			System.out.println("Din lipsa de personal, animalul nr " + counter +" va muri de foame");
		}
	
	}
}
