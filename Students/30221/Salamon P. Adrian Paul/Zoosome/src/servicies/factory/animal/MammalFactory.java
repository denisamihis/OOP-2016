package servicies.factory.animal;

import models.animals.Animal;
import models.animals.Cat;
import models.animals.Horse;
import models.animals.Rat;

public class MammalFactory extends SpeciesFactory {
	public Animal getAnimal(String type) {
		if (Constants.Animals.Mammals.Horse.equals(type)) {
			return new Horse();

		} else if (Constants.Animals.Mammals.Cat.equals(type)) {

			return new Cat();

		} else if (Constants.Animals.Mammals.Rat.equals(type)) {
			return new Rat();
		}
		else return null;
	}
}
