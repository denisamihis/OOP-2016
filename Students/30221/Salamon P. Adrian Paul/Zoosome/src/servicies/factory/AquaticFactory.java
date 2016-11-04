package servicies.factory;

import models.animals.Animal;
import models.animals.Salmon;
import models.animals.Shark;
import models.animals.Trout;

public class AquaticFactory extends SpeciesFactory {
	public  Animal getAnimal(String type) {
		if (Constants.Animals.Aquatics.Salmon.equals(type)) {
			return new Salmon();

		} else if (Constants.Animals.Aquatics.Trout.equals(type)) {

			return new Trout();

		} else if (Constants.Animals.Aquatics.Shark.equals(type)) {
			return new Shark();
		}
		return null;
	}
}
