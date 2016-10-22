package controllers;
import models.animals.*;
import services.factories.*;
import java.util.Random;
public class MainController {

	public static void main(String[] args) throws Exception {
		Random species = new Random();
		Random animal = new Random();
		int row = 0;
		int column = 0;
		AnimalFactory abstractFactory = new AnimalFactory();
		Animal a1 ;
		for (int counter = 1 ; counter<=50 ; counter++){
			
			
			row = species.nextInt(5);
			column = animal.nextInt(3);
			switch (row){
			case 0:{
				SpeciesFactory speciesFactory1 = abstractFactory.getSpeciesFactory(Constants.Species.Mammals);
				switch(column){
				case 0:{
					a1 = speciesFactory1.getAnimal(Constants.Animals.Mammals.Kangaroo);
					break;
				}
				case 1:{
					a1 = speciesFactory1.getAnimal(Constants.Animals.Mammals.Lion);
					break;
				}
				case 2:{
					a1 = speciesFactory1.getAnimal(Constants.Animals.Mammals.Tiger);
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
					a1 = speciesFactory1.getAnimal(Constants.Animals.Aquatics.Dolphin);
					break;
				}
				case 1:{
					a1 = speciesFactory1.getAnimal(Constants.Animals.Aquatics.Penguin);
					break;
				}
				case 2:{
					a1 = speciesFactory1.getAnimal(Constants.Animals.Aquatics.Seal);
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
					a1 = speciesFactory1.getAnimal(Constants.Animals.Birds.Eagle);
					break;
				}
				case 1:{
					a1 = speciesFactory1.getAnimal(Constants.Animals.Birds.Emu);
					break;
				}
				case 2:{
					a1 = speciesFactory1.getAnimal(Constants.Animals.Birds.Peacock);
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
					a1 = speciesFactory1.getAnimal(Constants.Animals.Insects.Butterfly);
					break;
				}
				case 1:{
					a1 = speciesFactory1.getAnimal(Constants.Animals.Insects.Cockroach);
					break;
				}
				case 2:{
					a1 = speciesFactory1.getAnimal(Constants.Animals.Insects.Spider);
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
					a1 = speciesFactory1.getAnimal(Constants.Animals.Reptiles.Crocodile);
					break;
				}
				case 1:{
					a1 = speciesFactory1.getAnimal(Constants.Animals.Reptiles.Snake);
					break;
				}
				case 2:{
					a1 = speciesFactory1.getAnimal(Constants.Animals.Reptiles.Turtle);
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
			System.out.printf("Animal %d : %s \n", counter , a1.getName());
		}

	}

}
