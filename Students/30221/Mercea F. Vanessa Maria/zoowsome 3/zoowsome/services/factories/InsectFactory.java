package factories;

import animals.Animal;
import animals.Ant;
import animals.Butterfly;
import animals.Mosquito;

public class InsectFactory extends SpeciesFactory {
	@Override
	public Animal getAnimal(String type) throws Exception {
		if (Constants.Animals.Insects.Ant.equals(type)) {
			return new Ant();
		} else if (Constants.Animals.Insects.Butterfly.equals(type)) {
			return new Butterfly();
		} else if (Constants.Animals.Insects.Mosquito.equals(type)) {
			return new Mosquito();
		} else
			throw new Exception("Invalid animal exception!");
	}
}
