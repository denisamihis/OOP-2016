package zoowsome;

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
		Animal[] randomAnim = new Animal[50];
		AnimalFactory abstractFactory = new AnimalFactory();
		SpeciesFactory speciesFactoryOne = abstractFactory.getSpeciesFactory(Constants.Species.Reptiles);
		Animal a1 = speciesFactoryOne.getAnimal(Constants.Animals.Reptiles.Gekko);
		System.out.printf("We have a %s with %d legs.  \n", a1.getName(), a1.getNrOfLegs());
		System.out.println("Does it lay eggs? " + ((Reptile) a1).getLaysEggs());
		RandomGenerator rand = new RandomGenerator();
		randomAnim = rand.generateRandom();
		for (int i = 0; i < 50; i++) {
			System.out.print(randomAnim[i].getName() + " ");
		}
	}
}
