package controllers;
import models.animals.*;
import models.employees.*;
import repositories.AnimalRepository;
import repositories.EmployeeRepository;
import services.factories.*;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
public class MainController {

	public static void main(String[] args) throws Exception {
		Scanner citire = new Scanner(System.in);
		ArrayList<Animal> array = new ArrayList<Animal>();
		AnimalRepository database = new AnimalRepository();
		ArrayList<Employee> array1 = new ArrayList<Employee>();
		EmployeeRepository database1 = new EmployeeRepository();
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
					Animal kangaroo = new Kangaroo();
					array.add(kangaroo);
					break;
				}
				case 1:{
					a1[counter] = speciesFactory1.getAnimal(Constants.Animals.Mammals.Lion);
					Animal lion = new Lion();
					array.add(lion);
					break;
				}
				case 2:{
					a1[counter] = speciesFactory1.getAnimal(Constants.Animals.Mammals.Tiger);
					Animal tiger = new Tiger();
					array.add(tiger);
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
					Animal dolphin = new Dolphin();
					array.add(dolphin);
					break;
				}
				case 1:{
					a1[counter] = speciesFactory1.getAnimal(Constants.Animals.Aquatics.Penguin);
					Animal penguin = new Penguin();
					array.add(penguin);
					break;
				}
				case 2:{
					a1[counter] = speciesFactory1.getAnimal(Constants.Animals.Aquatics.Seal);
					Animal seal = new Seal();
					array.add(seal);
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
					Animal eagle = new Eagle();
					array.add(eagle);
					break;
				}
				case 1:{
					a1[counter] = speciesFactory1.getAnimal(Constants.Animals.Birds.Emu);
					Animal emu = new Emu();
					array.add(emu);
					break;
				}
				case 2:{
					a1[counter] = speciesFactory1.getAnimal(Constants.Animals.Birds.Peacock);
					Animal peacock = new Peacock();
					array.add(peacock);
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
					Animal butterfly = new Butterfly();
					array.add(butterfly);
					break;
				}
				case 1:{
					a1[counter] = speciesFactory1.getAnimal(Constants.Animals.Insects.Cockroach);
					Animal cockroach = new Cockroach();
					array.add(cockroach);
					break;
				}
				case 2:{
					a1[counter] = speciesFactory1.getAnimal(Constants.Animals.Insects.Spider);
					Animal spider = new Spider();
					array.add(spider);
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
					Animal crocodile = new Crocodile();
					array.add(crocodile);
					break;
				}
				case 1:{
					a1[counter] = speciesFactory1.getAnimal(Constants.Animals.Reptiles.Snake);
					Animal snake = new Snake();
					array.add(snake);
					break;
				}
				case 2:{
					a1[counter] = speciesFactory1.getAnimal(Constants.Animals.Reptiles.Turtle);
					Animal turtle = new Turtle();
					array.add(turtle);
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
		for(int counter = 0;counter<angajat1.length;counter++){
			angajat1[counter] = test1.getEmployee();
			Employee caretaker = new CareTaker();
			System.out.println("Numele angajatului:");
			String nume = citire.nextLine();
			angajat1[counter].setName(nume);
			caretaker.setName(nume);
			array1.add(caretaker);
		}
		System.out.println("Nume\tSalariu");
		for (int counter = 0;counter<angajat1.length;counter++)
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
		citire.close();
		database.save(array);
		database1.save(array1);
	}
}
