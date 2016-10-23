package controllers;

import java.util.Random;

import models.animals.*;
import services.factories.*;

public class MainController {

	public static void main(String[] args) {
		Animal [] zoo = new Animal[50];
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
		int count, randomNr;
		Random rand = new Random();
		// not very random but ayyy :)
		for (count = 0; count < 50; count++)
		{
			randomNr = rand.nextInt(100);
			switch (randomNr%5)
			{
			case 0:
				switch(randomNr%3)
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
				switch(randomNr%3)
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
				switch(randomNr%3)
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
				switch(randomNr%3)
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
				switch(randomNr%3)
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
		System.out.println("So, the animals in this amazing zoo are: ");
		for (count = 0; count < 50; count ++)
			System.out.printf("%s \n", zoo[count].getClass());
	}	

}
