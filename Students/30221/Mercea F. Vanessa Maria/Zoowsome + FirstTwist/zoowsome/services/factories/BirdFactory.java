package factories;

import animals.Animal;
import animals.Mockingjay;
import animals.Stork;
import animals.Woodpecker;

public class BirdFactory extends SpeciesFactory {
	@Override
	public Animal getAnimal(String type) throws Exception {
		if (Constants.Animals.Birds.Mockingjay.equals(type)) {
			return new Mockingjay();
		} else if (Constants.Animals.Birds.Stork.equals(type)) {
			return new Stork();
		} else if (Constants.Animals.Birds.Woodpecker.equals(type)) {
			return new Woodpecker();
		} else {
			throw new Exception("Invalid animal exception!");
		}
	}
}
