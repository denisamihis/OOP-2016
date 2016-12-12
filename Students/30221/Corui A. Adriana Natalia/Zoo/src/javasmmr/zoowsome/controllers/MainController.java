package javasmmr.zoowsome.controllers;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.stream.XMLStreamException;

import org.xml.sax.SAXException;

import javasmmr.zoowesome.repositories.AnimalRepository;
import javasmmr.zoowesome.repositories.EmployeeRepository;
import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.models.animals.Duck;
import javasmmr.zoowsome.models.animals.Spider;
import javasmmr.zoowsome.models.animals.Turtle;
import javasmmr.zoowsome.models.employees.Caretaker;
import javasmmr.zoowsome.models.employees.Employee;
import javasmmr.zoowsome.services.factories.AnimalFactory;
import javasmmr.zoowsome.services.factories.Constants;
import javasmmr.zoowsome.services.factories.SpeciesFactory;

public class MainController {

	public static void main(String []args) throws XMLStreamException, ParserConfigurationException, SAXException, IOException
	{
		AnimalFactory abstractFactory=new AnimalFactory();
		Animal animal1=null;
		SpeciesFactory speciesFactory1=null;
		
		Animal[] animal=new Animal[3];
		Caretaker caretakers []=new Caretaker[4];
		caretakers[0]=new Caretaker("Joseph",BigDecimal.ONE);
		caretakers[1]=new Caretaker("Great Gatsby",BigDecimal.valueOf(125.6));
		caretakers[2]=new Caretaker("Flinstone",BigDecimal.valueOf(145.21));
		caretakers[3]=new Caretaker("Kjelld Yorrick Boomgaard",BigDecimal.valueOf(1450.21));
		animal[0]=new Duck(2.1,0.1);
		animal[2]=new Spider(1.7,0.9);
		animal[1]=new Turtle(1.3,0.1);
		caretakers[0].setWorkingHours(1);
		caretakers[1].setWorkingHours(2);
		caretakers[2].setWorkingHours(5);
		caretakers[3].setWorkingHours(10);
		try
		{
			
			speciesFactory1=abstractFactory.getSpeciesFactory(Constants.Species.Aquatics);
			animal1=speciesFactory1.getAnimal(Constants.Animals.Aquatics.Dolphin);
			System.out.printf("We have an animal with %d legs!\n", animal1.getNrOfLegs());
			

			
			for(int i=0;i< caretakers.length;i++)
				for(int j=0;j< animal.length;j++)
					if(caretakers[i].getIsDead()== false && animal[j].getTakenCareOf()==false)
					{
						String result = caretakers[i].takeCareOf(animal[j]);
						if(result.equals(Constants.Employees.Caretakers.TCO_KILLED))
						{	
							System.out.println(caretakers[i].getName()+" got killed by "+ animal[j].getName());
							caretakers[i].setIsDead(true);
						}
						else
							if(result.equals(Constants.Employees.Caretakers.TCO_NO_TIME))
							{
								System.out.println(caretakers[i].getName()+" doesnt have time to take care of "+ animal[j].getName());
								break;
							}
							else
								if(result.equals(Constants.Employees.Caretakers.TCO_SUCCESS))
								{
									System.out.println(caretakers[i].getName()+" took care of " + animal[j].getName());
									animal[j].setTakenCareOf(true);
								}
					}
					
				}	

		catch(Exception e)
		{
			System.out.println("Error");
		}
		AnimalRepository a = new AnimalRepository();
		ArrayList<Animal> animalList= new ArrayList<Animal>(3);
		animalList.add(animal[0]);
		animalList.add(animal[1]);
		animalList.add(animal[2]);
		a.save(animalList);
		//a.load();
		EmployeeRepository emplRepository=new EmployeeRepository();
		ArrayList<Employee> e = new ArrayList<Employee>(4);
		e.add(caretakers[0]);
		e.add(caretakers[1]);
		e.add(caretakers[2]);
		e.add(caretakers[3]);
		emplRepository.save(e);
		//emplRepository.load();
	}
}
