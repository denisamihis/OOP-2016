package factories;

import animals.Animal;
import animals.Seahorse;
import animals.Shark;
import animals.Whale;

public class AquaticFactory extends SpeciesFactory {
	@Override
	public Animal getAnimal(String type) throws Exception {
		if (Constants.Animals.Aquatics.Seahorse.equals(type)) {
			return new Seahorse();
		} else if (Constants.Animals.Aquatics.Shark.equals(type)) {
			return new Shark();
		} else if (Constants.Animals.Aquatics.Whale.equals(type)) {
			return new Whale();
		} else {
			throw new Exception("Invalid animal exception!");
		}
	}
}
