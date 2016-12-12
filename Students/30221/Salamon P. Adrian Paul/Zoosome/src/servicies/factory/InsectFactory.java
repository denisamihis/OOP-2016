package servicies.factory;

import models.animals.Animal;
import models.animals.Ant;
import models.animals.Fly;
import models.animals.Moth;


public class InsectFactory extends SpeciesFactory {
	@Override
	public Animal getAnimal(String type) {
		if (Constants.Animals.Insects.Ant.equals(type)) {
			return new Ant();

		} else if (Constants.Animals.Insects.Fly.equals(type)) {

			return new Fly();

		} else if (Constants.Animals.Insects.Moth.equals(type)) {
			return new Moth();
		}
		return null;
	}
}
