package zoowsomeLucaAndrei;

import java.util.Random;

import animals.Animal;
import animals.Mammal;
import animals.Reptile;
import animals.Bird;
import animals.Aquatic;
import animals.Insect;
import factories.AnimalFactory;
import factories.Constants;
import factories.SpeciesFactory;

public class MainController {
	public static void main(String[] args) throws Exception {
		Animal[] animals = new Animal[50];
		AnimalFactory abstractFactory = new AnimalFactory();
		SpeciesFactory speciesFactory1 = abstractFactory.getSpeciesFactory(Constants.Species.Aquatics);
		Animal a1 = speciesFactory1.getAnimal(Constants.Animals.Aquatics.KoiFish);
		animals = MainController.randomise();
		for (int i = 0; i < 50; i++)
			System.out.printf("We have an/a %s with %d legs!\n", animals[i].getName(), animals[i].getNrOfLegs());
	}

	public static Animal[] randomise() throws Exception {
		int i;
		Animal[] animals = new Animal[50];
		Random random = new Random();
		SpeciesFactory speciesFactory1;
		AnimalFactory abstractFactory = new AnimalFactory();
		for (i = 0; i < 50; i++) {
			switch (random.nextInt(5)) {
			case 0:
				switch (random.nextInt(3)) {
				case 0:
					speciesFactory1 = abstractFactory.getSpeciesFactory(Constants.Species.Aquatics);
					animals[i] = speciesFactory1.getAnimal(Constants.Animals.Aquatics.KoiFish);
					break;
				case 1:
					speciesFactory1 = abstractFactory.getSpeciesFactory(Constants.Species.Aquatics);
					animals[i] = speciesFactory1.getAnimal(Constants.Animals.Aquatics.JellyFish);
					break;
				case 2:
					speciesFactory1 = abstractFactory.getSpeciesFactory(Constants.Species.Aquatics);
					animals[i] = speciesFactory1.getAnimal(Constants.Animals.Aquatics.SeaTurtle);
					break;
				}
				break;
			case 1:
				switch (random.nextInt(3)) {
				case 0:
					speciesFactory1 = abstractFactory.getSpeciesFactory(Constants.Species.Mammals);
					animals[i] = speciesFactory1.getAnimal(Constants.Animals.Mammals.Lion);
					break;
				case 1:
					speciesFactory1 = abstractFactory.getSpeciesFactory(Constants.Species.Mammals);
					animals[i] = speciesFactory1.getAnimal(Constants.Animals.Mammals.PolarBear);
					break;
				case 2:
					speciesFactory1 = abstractFactory.getSpeciesFactory(Constants.Species.Mammals);
					animals[i] = speciesFactory1.getAnimal(Constants.Animals.Mammals.Racoon);
					break;
				}
				break;
			case 2:
				switch (random.nextInt(3)) {
				case 0:
					speciesFactory1 = abstractFactory.getSpeciesFactory(Constants.Species.Birds);
					animals[i] = speciesFactory1.getAnimal(Constants.Animals.Birds.Falcon);
					break;
				case 1:
					speciesFactory1 = abstractFactory.getSpeciesFactory(Constants.Species.Birds);
					animals[i] = speciesFactory1.getAnimal(Constants.Animals.Birds.BlackSparrow);
					break;
				case 2:
					speciesFactory1 = abstractFactory.getSpeciesFactory(Constants.Species.Birds);
					animals[i] = speciesFactory1.getAnimal(Constants.Animals.Birds.Pelican);
					break;
				}
				break;
			case 3:
				switch (random.nextInt(3)) {
				case 0:
					speciesFactory1 = abstractFactory.getSpeciesFactory(Constants.Species.Insects);
					animals[i] = speciesFactory1.getAnimal(Constants.Animals.Insects.StingBee);
					break;
				case 1:
					speciesFactory1 = abstractFactory.getSpeciesFactory(Constants.Species.Insects);
					animals[i] = speciesFactory1.getAnimal(Constants.Animals.Insects.RedAnt);
					break;
				case 2:
					speciesFactory1 = abstractFactory.getSpeciesFactory(Constants.Species.Insects);
					animals[i] = speciesFactory1.getAnimal(Constants.Animals.Insects.Beetle);
					break;
				}
				break;
			case 4:
				switch (random.nextInt(3)) {
				case 0:
					speciesFactory1 = abstractFactory.getSpeciesFactory(Constants.Species.Reptiles);
					animals[i] = speciesFactory1.getAnimal(Constants.Animals.Reptiles.BlackMamba);
					break;
				case 1:
					speciesFactory1 = abstractFactory.getSpeciesFactory(Constants.Species.Reptiles);
					animals[i] = speciesFactory1.getAnimal(Constants.Animals.Reptiles.Cameleon);
					break;
				case 2:
					speciesFactory1 = abstractFactory.getSpeciesFactory(Constants.Species.Reptiles);
					animals[i] = speciesFactory1.getAnimal(Constants.Animals.Reptiles.Lizzard);
					break;
				}
				break;
			}
		}
		return animals;
	}

}
