package zoowsomeLucaAndrei;

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
		AnimalFactory abstractFactory = new AnimalFactory();
		SpeciesFactory speciesFactory1 = abstractFactory.getSpeciesFactory(Constants.Species.Aquatics);
		Animal a1 = speciesFactory1.getAnimal(Constants.Animals.Aquatics.KoiFish);
		System.out.printf("We have an/a %s with %d legs!\n", a1.getName(),a1.getNrOfLegs());
	}
}
