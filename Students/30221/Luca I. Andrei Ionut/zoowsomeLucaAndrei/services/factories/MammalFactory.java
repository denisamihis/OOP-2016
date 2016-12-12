package factories;

import animals.Animal;
import animals.Lion;
import animals.PolarBear;
import animals.Racoon;

public class MammalFactory extends SpeciesFactory {
	@Override
	public Animal getAnimal(String type) throws Exception {
		if (Constants.Animals.Mammals.Lion.equals(type)) {
			return new Lion(); // leave empty constructor, for now!
		} else if (Constants.Animals.Mammals.PolarBear.equals(type)) {
			return new PolarBear();
		} else if (Constants.Animals.Mammals.Racoon.equals(type)) {
			return new Racoon();
		} else {
			throw new Exception("Invalid animal exception!");
		}
	}
}