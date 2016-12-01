package factories;

import animals.Animal;
import animals.Deer;
import animals.Hyena;
import animals.Kangaroo;

public class MammalFactory extends SpeciesFactory {
	@Override
	public Animal getAnimal(String type) throws Exception {
		if (Constants.Animals.Mammals.Deer.equals(type)) {
			return new Deer();
		} else if (Constants.Animals.Mammals.Hyena.equals(type)) {
			return new Hyena();
		} else if (Constants.Animals.Mammals.Kangaroo.equals(type)) {
			return new Kangaroo();
		} else
			throw new Exception("Invalid animal exception!");
	}
}
