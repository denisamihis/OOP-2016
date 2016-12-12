package factories;

import animals.Animal;
import animals.Gekko;
import animals.Seaturtle;
import animals.Snake;

public class ReptileFactory extends SpeciesFactory {
	@Override
	public Animal getAnimal(String type) throws Exception {
		if (Constants.Animals.Reptiles.Gekko.equals(type)) {
			return new Gekko();
		} else if (Constants.Animals.Reptiles.Seaturtle.equals(type)) {
			return new Seaturtle();
		} else if (Constants.Animals.Reptiles.Snake.equals(type)) {
			return new Snake();
		} else
			throw new Exception("Invalid animal exception!");
	}
}
