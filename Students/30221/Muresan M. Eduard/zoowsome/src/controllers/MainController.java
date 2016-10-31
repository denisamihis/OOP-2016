package controllers;

import java.util.Random;

import models.animals.*;
import models.employees.*;
import services.factories.*;
import services.factories.animalFactory.*;
import services.factories.employeeFactory.*;

public class MainController {
	public static void main(String[] args) {
		Animal [] zoo;
		Caretaker [] staff;
		int count;
		String result;
		zoo = createZoo(50);
		staff = hireCaretakers(150);
		System.out.println("So, the animals in this amazing zoo are: ");
		for (count = 0; count < zoo.length; count ++)
			System.out.printf("A %s named: %s \n", zoo[count].getClass().getSimpleName(), zoo[count].getName());
		System.out.println("Aaaaand the caretakers working in this amazing zoo are: ");
		for (count = 0; count < staff.length; count++)
			System.out.printf("%s \n", staff[count].getName());
		// russian roulette :) one single flamingo killed 3 employees during testing, one tiger killed 23, and for 150 employees, 32 survived the day
		for (Caretaker c : staff)
		{
			for (Animal a : zoo)
			{
				if (!c.getIsDead() && !a.getTakenCareOf())
				{
					result = c.takeCareOf(a);
					if (result.equals(Constants.Employees.Caretakers.TCO_KILLED))
					{
						c.setIsDead(true);
						System.out.printf("Caretaker %s has been killed by a %s named %s \n", c.getName(), a.getClass().getSimpleName(), a.getName());
					}
					else if (result.equals(Constants.Employees.Caretakers.TCO_NO_TIME))
						continue;
					else
						System.out.printf("Caretaker %s took care of %s the %s\n", c.getName(), a.getName(), a.getClass().getSimpleName());
				}
			}
		}
		/*
		System.out.println("So, have the animals been taken care of? ");
		for (count = 0; count < zoo.length; count ++)
			System.out.printf("A %s named: %s? %b \n", zoo[count].getClass().getSimpleName(), zoo[count].getName(), zoo[count].getTakenCareOf());
		System.out.println("Aaaaand which of the caretakers are dead? :(: ");
		for (count = 0; count < staff.length; count++)
			System.out.printf("%s %b\n", staff[count].getName(), staff[count].getIsDead());
		*/
	}
	public static Caretaker[] hireCaretakers(int nrOfEmployees)
	{
		Caretaker[] staff = new Caretaker[nrOfEmployees];
		AbstractEmployeeFactory employeeFactory = new AbstractEmployeeFactory();
		EmployeeFactory caretakerFactory = null;
		try
		{
			caretakerFactory = employeeFactory.getEmployee(Constants.Employees.Caretaker);
		}
		catch(InvalidEmployeeException ex)
		{
			System.out.printf("InvalidEmployees: %s\n", ex.getType());
		}
		int count;
		// momentan, facem doar caretakes :)
		for (count = 0; count < nrOfEmployees; count++)
		{
			staff[count] = (Caretaker)caretakerFactory.getEmployee();
		}
		return staff;
	}
	public static Animal[] createZoo(int nrOfAnimals)
	{
		Animal[] zoo = new Animal[nrOfAnimals];
		AnimalFactory abstractFactory = new AnimalFactory();
		SpeciesFactory mammalFactory = null;
		SpeciesFactory aquaticFactory = null;
		SpeciesFactory birdFactory = null;
		SpeciesFactory insectFactory = null;
		SpeciesFactory reptileFactory = null;
		try{
			mammalFactory = abstractFactory.getSpeciesFactory(Constants.Species.Mammals);
			aquaticFactory = abstractFactory.getSpeciesFactory(Constants.Species.Aquatics);
			birdFactory = abstractFactory.getSpeciesFactory(Constants.Species.Birds);
			insectFactory = abstractFactory.getSpeciesFactory(Constants.Species.Insects);
			reptileFactory = abstractFactory.getSpeciesFactory(Constants.Species.Reptiles);
		}
		catch(InvalidSpeciesException ex)
		{
			System.out.printf("InvalidSpecies: %s\n", ex.getType());
		}
		int count;
		Random rand = new Random();
		// not very random but ayyy :)
		for (count = 0; count < nrOfAnimals; count++)
		{
			switch (rand.nextInt(5))
			{
			case 0:
				switch(rand.nextInt(3))
				{
				case 0:
					try{
						zoo[count] = mammalFactory.getAnimal(Constants.Animals.Mammals.Gopher);
					}catch(InvalidSpeciesException ex)
					{
						System.out.printf("Invalid species: %s\n", ex.getType());
					}
					break;
				case 1:
					try{
						zoo[count] = mammalFactory.getAnimal(Constants.Animals.Mammals.Kangaroo);
					}catch(InvalidSpeciesException ex)
					{
						System.out.printf("Invalid species: %s\n", ex.getType());
					}
					break;
				default:
					try{
						zoo[count] = mammalFactory.getAnimal(Constants.Animals.Mammals.Tiger);
					}catch(InvalidSpeciesException ex)
					{
						System.out.printf("Invalid species: %s\n", ex.getType());
					}	
				}
				break;
			case 1:
				switch(rand.nextInt(3))
				{
				case 0:
					try{
						zoo[count] = aquaticFactory.getAnimal(Constants.Animals.Aquatics.Seahorse);
					}catch(InvalidSpeciesException ex)
					{
						System.out.printf("Invalid species: %s\n", ex.getType());
					}
					break;
				case 1:
					try{
						zoo[count] = aquaticFactory.getAnimal(Constants.Animals.Aquatics.Shark);
					}catch(InvalidSpeciesException ex)
					{
						System.out.printf("Invalid species: %s\n", ex.getType());
					}
					break;
				default:
					try{
						zoo[count] = aquaticFactory.getAnimal(Constants.Animals.Aquatics.Stingray);
					}catch(InvalidSpeciesException ex)
					{
						System.out.printf("Invalid species: %s\n", ex.getType());
					}
				}
				break;
			case 2:
				switch(rand.nextInt(3))
				{
				case 0:
					try{
						zoo[count] = birdFactory.getAnimal(Constants.Animals.Birds.Duck);
					}catch(InvalidSpeciesException ex)
					{
						System.out.printf("Invalid species: %s\n", ex.getType());
					}
					break;
				case 1:
					try{
						zoo[count] = birdFactory.getAnimal(Constants.Animals.Birds.Ostrich);
					}catch(InvalidSpeciesException ex)
					{
						System.out.printf("Invalid species: %s\n", ex.getType());
					}
					break;
				default:
					try{
						zoo[count] = birdFactory.getAnimal(Constants.Animals.Birds.Flamingo);
					}catch(InvalidSpeciesException ex)
					{
						System.out.printf("Invalid species: %s\n", ex.getType());
					}
				}
				break;
			case 3:
				switch(rand.nextInt(3))
				{
				case 0:
					try{
						zoo[count] = insectFactory.getAnimal(Constants.Animals.Insects.FireAnt);
					}catch(InvalidSpeciesException ex)
					{
						System.out.printf("Invalid species: %s\n", ex.getType());
					}
					break;
				case 1:
					try{
						zoo[count] = insectFactory.getAnimal(Constants.Animals.Insects.Snail);
					}catch(InvalidSpeciesException ex)
					{
						System.out.printf("Invalid species: %s\n", ex.getType());
					}
					break;
				default:
					try{
						zoo[count] = insectFactory.getAnimal(Constants.Animals.Insects.StagBeetle);
					}catch(InvalidSpeciesException ex)
					{
						System.out.printf("Invalid species: %s\n", ex.getType());
					}
				}
				break;
			default:
				switch(rand.nextInt(3))
				{
				case 0:
					try{
						zoo[count] = reptileFactory.getAnimal(Constants.Animals.Reptiles.Aligator);
					}catch(InvalidSpeciesException ex)
					{
						System.out.printf("Invalid species: %s\n", ex.getType());
					}
					break;
				case 1:
					try{
						zoo[count] = reptileFactory.getAnimal(Constants.Animals.Reptiles.Iguana);
					}catch(InvalidSpeciesException ex)
					{
						System.out.printf("Invalid species: %s\n", ex.getType());
					}
					break;
				default:
					try{
						zoo[count] = reptileFactory.getAnimal(Constants.Animals.Reptiles.KomodoDragon);	
					}catch(InvalidSpeciesException ex)
					{
						System.out.printf("Invalid species: %s\n", ex.getType());
					}
				}
				
			}
		}
		return zoo;
	}

}
