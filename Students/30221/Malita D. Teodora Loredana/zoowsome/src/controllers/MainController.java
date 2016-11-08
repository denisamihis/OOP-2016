package controllers;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.stream.XMLStreamException;

import org.xml.sax.SAXException;

import models.animlas.*;
import models.employees.Caretaker;
import models.employees.Employee;
import repositories.AnimalRepository;
import repositories.EmployeeRepository;
import services.factories.animalFactory.AnimalFactory;
import services.factories.animalFactory.Constants;
import services.factories.animalFactory.InvalidSpeciesException;
import services.factories.animalFactory.SpeciesFactory;
import services.factories.employeeFactory.*;

public class MainController {

	public static void main(String[] args) throws InvalidSpeciesException {
		AnimalFactory abstractFactory = new AnimalFactory();
		SpeciesFactory mammalFactory = abstractFactory.getSpeciesFactory(Constants.Species.Mammals);
		SpeciesFactory birdsFactory = abstractFactory.getSpeciesFactory(Constants.Species.Birds);
		SpeciesFactory reptileFactory = abstractFactory.getSpeciesFactory(Constants.Species.Reptiles);
		SpeciesFactory insectsFactory = abstractFactory.getSpeciesFactory(Constants.Species.Insects);
		SpeciesFactory aquaticFactory = abstractFactory.getSpeciesFactory(Constants.Species.Aquatics);
		Animal [] zoo=new Animal[50];
		ArrayList<Animal> zooo = new ArrayList<Animal>();
		Random rosu = new Random();
		int counter;
		for(counter=0;counter<50;counter++)
		{
			switch(rosu.nextInt(5))
			{
			case 0 :
				switch (rosu.nextInt(3))
				{
				case 0 :
					zoo[counter]=mammalFactory.getAnimal(Constants.Animals.Mammals.Cat);
					break;
				case 1 :
					zoo[counter]=mammalFactory.getAnimal(Constants.Animals.Mammals.Dog);
					break;
				default : 
					zoo[counter]=mammalFactory.getAnimal(Constants.Animals.Mammals.Tiger);
				}
				break;
			case 1 :
				switch(rosu.nextInt(3))
				{
				case 0 :
					zoo[counter]=birdsFactory.getAnimal(Constants.Animals.Birds.Dove);
					break;
				case 1 :
					zoo[counter]=birdsFactory.getAnimal(Constants.Animals.Birds.Eagle);
					break;
				default :
					zoo[counter]=birdsFactory.getAnimal(Constants.Animals.Birds.Flamingo);
				}
				break;
			case 2 :
				switch(rosu.nextInt(3))
				{
				case 0 :
					zoo[counter]=reptileFactory.getAnimal(Constants.Animals.Reptiles.Chamameleon);
					break;
				case 1: 
					zoo[counter]=reptileFactory.getAnimal(Constants.Animals.Reptiles.Crocodile);
					break;
				default :
					zoo[counter]=reptileFactory.getAnimal(Constants.Animals.Reptiles.Snake);			
				}
				break;
			case 3 :
				switch(rosu.nextInt(3))
				{
				case 0 :
					zoo[counter]=insectsFactory.getAnimal(Constants.Animals.Insects.Butterfly);
					break;
				case 1 :
					zoo[counter]=insectsFactory.getAnimal(Constants.Animals.Insects.Moschito);
					break;
				default :
					zoo[counter]=insectsFactory.getAnimal(Constants.Animals.Insects.Spider);
				}
				break;
			default :
				switch(rosu.nextInt(3))
				{
				case 0:
					zoo[counter]=aquaticFactory.getAnimal(Constants.Animals.Aquatics.Crab);
					break;
				case 1 :
					zoo[counter]=aquaticFactory.getAnimal(Constants.Animals.Aquatics.Seal);
					break;
				default :
					zoo[counter]=aquaticFactory.getAnimal(Constants.Animals.Aquatics.Solmon);
				}
			}
		}
		Caretaker[] meal = new Caretaker[10000];
		ArrayList<Employee> meals = new ArrayList<Employee>();
		EmployeeAbstractFactory employeeFact = new EmployeeAbstractFactory();
		CaretakersFactory caretakerFact = null;
		try {
			caretakerFact = (CaretakersFactory)employeeFact.getEmployeesFactory(services.factories.employeeFactory.Constants.Employees.Caretaker);
		} catch (InvalidEmployeeException e) {
			System.out.println("Invalid Employee Type: "+e.getType());
		}
		for (counter = 0; counter < 10000; counter++)
			try {
				meal[counter] = (Caretaker)caretakerFact.getEmployee(services.factories.employeeFactory.Constants.Employees.Caretaker);
			} catch (InvalidEmployeeException e) {
				System.out.println("Invalid Employee Type: "+e.getType());
			}
		String result;
		for (Caretaker c: meal)
			for (Animal a: zoo)
			{
				if(c.getIsDead()==false && a.getTakenCareOf()==false)
				{
					result = c.takeCareOf(a);
					if(result.equals(services.factories.employeeFactory.Constants.Cartakers.TCO_KILLED))
					{
						c.setIsDead(true);
						System.out.printf("A caretaker was killed by a %s. R.I.P!\n", a.getClass().getSimpleName());	
					}
					else if (result.equals(services.factories.employeeFactory.Constants.Cartakers.TCO_NO_TIME))
						continue;
					else
						System.out.printf("A caretaker took care of an %s.Yeeeee! \n",a.getClass().getSimpleName());
				}
			}
		for(Animal a : zoo)
			zooo.add(a);
		for(Caretaker c: meal)
			meals.add(c);
		AnimalRepository aR = new AnimalRepository();
		try 
		{
			aR.save(zooo);
		}
		catch (FileNotFoundException | XMLStreamException e) 
		{
			e.printStackTrace();
		}
		EmployeeRepository eR = new EmployeeRepository();
		try 
		{
			eR.save(meals);
		} catch (FileNotFoundException | XMLStreamException e) 
		{
			e.printStackTrace();
		}
		/*try //da o exceptie pe care nu stiu sa o rezolv 
		{
			zooo = aR.load();
		} 
		catch (ParserConfigurationException | SAXException | IOException e) 
		{
			e.printStackTrace();
		}*/
	}
		

}
