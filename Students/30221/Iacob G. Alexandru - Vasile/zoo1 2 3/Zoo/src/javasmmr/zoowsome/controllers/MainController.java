package javasmmr.zoowsome.controllers;

import javasmmr.zoowsome.models.animals.*;
import javasmmr.zoowsome.models.employees.Caretaker;
import javasmmr.zoowsome.models.employees.Employee;
import javasmmr.zoowsome.services.factories.*;
import javasmmr.zoowsome.services.factories.employees.EmployeeFactory;

import java.util.Random;
public class MainController {
	public static void main(String[] args) throws Exception {
		Random random = new Random();
		Animal anim[] = new Animal[Constants.NR_OF_ANIMALS];
		AnimalFactory abstractFactory = new AnimalFactory();
		
		for(int i = 0; i < Constants.NR_OF_ANIMALS; i++) {
			int animalType = random.nextInt(Constants.NR_OF_DIF_ANIMALS) +1;
			int speciesType = random.nextInt(Constants.NR_OF_SPECIES) +1;
			switch (speciesType) {
			case 1:
				SpeciesFactory speciesFactory = abstractFactory.getSpeciesFactory(Constants.Species.MAMMALS);
				switch(animalType) {
					
				case 1:
					anim[i] = speciesFactory.getAnimal(Constants.Animals.Mammals.COW);
					break;
						
				case 2 :
					anim[i] = speciesFactory.getAnimal(Constants.Animals.Mammals.MONKEY);
					break;
					
				case 3:
					anim[i] = speciesFactory.getAnimal(Constants.Animals.Mammals.TIGER);
					break;
				}
				break;
					
				case 2:
					SpeciesFactory speciesFactory2 = abstractFactory.getSpeciesFactory(Constants.Species.BIRDS);
					switch(animalType) {
						
					case 1:
						anim[i] = speciesFactory2.getAnimal(Constants.Animals.Birds.CHICKEN);
						break;
							
					case 2:
						anim[i] = speciesFactory2.getAnimal(Constants.Animals.Birds.EAGLE);
						break;
						
					case 3:
						anim[i] = speciesFactory2.getAnimal(Constants.Animals.Birds.PIGEON);
						break;
					}
					break;
					
				case 3:
					SpeciesFactory speciesFactory3 = abstractFactory.getSpeciesFactory(Constants.Species.AQUATICS);
					switch(animalType) {
						
					case 1:
						anim[i] = speciesFactory3.getAnimal(Constants.Animals.Aquatics.GOLDFISH);
						break;
							
					case 2:
						anim[i] = speciesFactory3.getAnimal(Constants.Animals.Aquatics.SALMON);
						break;
						
					case 3:
						anim[i] = speciesFactory3.getAnimal(Constants.Animals.Aquatics.SHARK);
						break;
					}
					break;
					
				case 4:
					SpeciesFactory speciesFactory4 = abstractFactory.getSpeciesFactory(Constants.Species.INSECTS);
					switch(animalType) {
						
					case 1:
						anim[i] = speciesFactory4.getAnimal(Constants.Animals.Insects.BUTTERFLY);
						break;
							
					case 2:
						anim[i] = speciesFactory4.getAnimal(Constants.Animals.Insects.DRAGONFLY);
						break;
						
					case 3:
						anim[i] = speciesFactory4.getAnimal(Constants.Animals.Insects.SPIDER);
						break;
					}
					break;
					
				case 5:
					SpeciesFactory speciesFactory5 = abstractFactory.getSpeciesFactory(Constants.Species.REPTILES);
					switch(animalType) {
						
					case 1:
						anim[i] = speciesFactory5.getAnimal(Constants.Animals.Reptiles.CROCODILE);
						break;
							
					case 2:
						anim[i] = speciesFactory5.getAnimal(Constants.Animals.Reptiles.LIZARD);
						break;
						
					case 3:
						anim[i] = speciesFactory5.getAnimal(Constants.Animals.Reptiles.SNAKE);
						break;
					}
					break;
						
			}
		}
		
		
		for(int i = 0; i < Constants.NR_OF_ANIMALS; i++) {
			System.out.printf("My name is %s and i have %d legs! Feels good, man!\n",anim[i].getName(),anim[i].getNrOfLegs());
		}
		
		
		Employee caretaker[] = new Employee[Constants.NR_OF_EMPLOYEES];
		EmployeeFactory employeeFactory = new EmployeeFactory();
		String result;
		for(int i = 0; i < Constants.NR_OF_EMPLOYEES; i++) {
			caretaker[i] = employeeFactory.getEmployee(Constants.Employees.CARETAKER);
			System.out.println(caretaker[i].getName()+" "+caretaker[i].getId()+" "+caretaker[i].getSalary());
		}
		for(int i = 0; i < Constants.NR_OF_EMPLOYEES; i++) {
			for(int j = 0; j < Constants.NR_OF_ANIMALS; j++) {
				if((caretaker[i].isDead()==false) && (anim[i].isTakenCareOf()==false)) {
					result = ((Caretaker) caretaker[i]).takeCareOfAnimal(anim[j]);
					if(result.equals(Constants.Employees.Caretakers.TCO_KILLED)) {
						caretaker[i].setDead(true);
					} else if (result.equals(Constants.Employees.Caretakers.TCO_NO_TIME)) {
							continue;
					} else {
						anim[i].setTakenCareOf(true);
					}
					
				}
			}
		}
		for(int i = 0; i < Constants.NR_OF_ANIMALS; i++) {
			System.out.println(anim[i].getName()+ " is taken care of: "+anim[i].isTakenCareOf());
		}
		
		
		
	}
}
