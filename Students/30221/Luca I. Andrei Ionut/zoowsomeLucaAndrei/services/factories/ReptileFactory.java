package factories;

import animals.Animal;
import animals.BlackMamba;
import animals.Cameleon;
import animals.Lizzard;

public class ReptileFactory extends SpeciesFactory {
	@Override
	public Animal getAnimal(String type) throws Exception {
		if (Constants.Animals.Reptiles.BlackMamba.equals(type)) {
			return new BlackMamba(); // leave empty constructor, for now!
		} else if (Constants.Animals.Reptiles.Lizzard.equals(type)) {
			return new Lizzard();
		} else if (Constants.Animals.Reptiles.Cameleon.equals(type)) {
			return new Cameleon();
		} else {
			throw new Exception("Invalid animal exception!");
		}
	}
}