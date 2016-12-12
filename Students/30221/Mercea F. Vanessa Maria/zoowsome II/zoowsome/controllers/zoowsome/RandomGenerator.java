package zoowsome;

import java.util.Random;

import animals.Animal;
import factories.AnimalFactory;
import factories.Constants;
import factories.SpeciesFactory;

public class RandomGenerator {

	public Animal[] generateRandom() throws Exception {
		Random random = new Random();
		Animal[] randomAnimals = new Animal[50];
		AnimalFactory abstractFactory;
		SpeciesFactory speciesFactoryOne;

		for (int i = 0; i < 50; i++) {
			switch (random.nextInt(5)) {
			case 0: // e Aquatic
				switch (random.nextInt(3)) {
				case 0:
					abstractFactory = new AnimalFactory();
					speciesFactoryOne = abstractFactory.getSpeciesFactory(Constants.Species.Aquatics);
					randomAnimals[i] = speciesFactoryOne.getAnimal(Constants.Animals.Aquatics.Seahorse);
					break;
				case 1:
					abstractFactory = new AnimalFactory();
					speciesFactoryOne = abstractFactory.getSpeciesFactory(Constants.Species.Aquatics);
					randomAnimals[i] = speciesFactoryOne.getAnimal(Constants.Animals.Aquatics.Shark);
					break;
				case 2:
					abstractFactory = new AnimalFactory();
					speciesFactoryOne = abstractFactory.getSpeciesFactory(Constants.Species.Aquatics);
					randomAnimals[i] = speciesFactoryOne.getAnimal(Constants.Animals.Aquatics.Whale);
					break;
				}
				break;

			case 1: // e Bird
				switch (random.nextInt(3)) {
				case 0:
					abstractFactory = new AnimalFactory();
					speciesFactoryOne = abstractFactory.getSpeciesFactory(Constants.Species.Birds);
					randomAnimals[i] = speciesFactoryOne.getAnimal(Constants.Animals.Birds.Mockingjay);
					break;
				case 1:
					abstractFactory = new AnimalFactory();
					speciesFactoryOne = abstractFactory.getSpeciesFactory(Constants.Species.Birds);
					randomAnimals[i] = speciesFactoryOne.getAnimal(Constants.Animals.Birds.Stork);
					break;
				case 2:
					abstractFactory = new AnimalFactory();
					speciesFactoryOne = abstractFactory.getSpeciesFactory(Constants.Species.Birds);
					randomAnimals[i] = speciesFactoryOne.getAnimal(Constants.Animals.Birds.Woodpecker);
					break;
				}
				break;
				
			case 2:
				switch (random.nextInt(3)) {
				case 0:
					abstractFactory = new AnimalFactory();
					speciesFactoryOne = abstractFactory.getSpeciesFactory(Constants.Species.Insects);
					randomAnimals[i] = speciesFactoryOne.getAnimal(Constants.Animals.Insects.Ant);
					break;
				case 1:
					abstractFactory = new AnimalFactory();
					speciesFactoryOne = abstractFactory.getSpeciesFactory(Constants.Species.Insects);
					randomAnimals[i] = speciesFactoryOne.getAnimal(Constants.Animals.Insects.Butterfly);
					break;
				case 2:
					abstractFactory = new AnimalFactory();
					speciesFactoryOne = abstractFactory.getSpeciesFactory(Constants.Species.Insects);
					randomAnimals[i] = speciesFactoryOne.getAnimal(Constants.Animals.Insects.Mosquito);
					break;
				}
				break;
				
			case 3:
				switch (random.nextInt(3)) {
				case 0:
					abstractFactory = new AnimalFactory();
					speciesFactoryOne = abstractFactory.getSpeciesFactory(Constants.Species.Mammals);
					randomAnimals[i] = speciesFactoryOne.getAnimal(Constants.Animals.Mammals.Deer);
					break;
				case 1:
					abstractFactory = new AnimalFactory();
					speciesFactoryOne = abstractFactory.getSpeciesFactory(Constants.Species.Mammals);
					randomAnimals[i] = speciesFactoryOne.getAnimal(Constants.Animals.Mammals.Hyena);
					break;
				case 2:
					abstractFactory = new AnimalFactory();
					speciesFactoryOne = abstractFactory.getSpeciesFactory(Constants.Species.Mammals);
					randomAnimals[i] = speciesFactoryOne.getAnimal(Constants.Animals.Mammals.Kangaroo);
					break;
				}
				break;
				
			case 4:
				switch (random.nextInt(3)) {
				case 0:
					abstractFactory = new AnimalFactory();
					speciesFactoryOne = abstractFactory.getSpeciesFactory(Constants.Species.Reptiles);
					randomAnimals[i] = speciesFactoryOne.getAnimal(Constants.Animals.Reptiles.Gekko);
					break;
				case 1:
					abstractFactory = new AnimalFactory();
					speciesFactoryOne = abstractFactory.getSpeciesFactory(Constants.Species.Reptiles);
					randomAnimals[i] = speciesFactoryOne.getAnimal(Constants.Animals.Reptiles.Seaturtle);
					break;
				case 2:
					abstractFactory = new AnimalFactory();
					speciesFactoryOne = abstractFactory.getSpeciesFactory(Constants.Species.Reptiles);
					randomAnimals[i] = speciesFactoryOne.getAnimal(Constants.Animals.Reptiles.Snake);
					break;
				}
				break;
			}

		}
		return randomAnimals;
	}
}
