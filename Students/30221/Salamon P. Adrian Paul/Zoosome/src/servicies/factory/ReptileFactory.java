package servicies.factory;

import models.animals.Animal;
import models.animals.Chameleon;
import models.animals.Lizard;
import models.animals.Turtle;

public class ReptileFactory extends SpeciesFactory {
	
	public Animal getAnimal(String type) {
		if (Constants.Animals.Reptiles.Turtle.equals(type)) {
			return new Turtle();

		} else if (Constants.Animals.Reptiles.Lizard.equals(type)) {

			return new Lizard();

		} else if (Constants.Animals.Reptiles.Chameleon.equals(type)) {
			return new Chameleon();
		}
		return null;
	}
}
