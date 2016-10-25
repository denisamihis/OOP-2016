package factories;

import animals.Animal;
import animals.BlackSparrow;
import animals.Falcon;
import animals.Pelican;

public class BirdFactory extends SpeciesFactory {
	@Override
	public Animal getAnimal(String type) throws Exception {
		if (Constants.Animals.Birds.Falcon.equals(type)) {
			return new Falcon(); // leave empty constructor, for now!
		} else if (Constants.Animals.Birds.BlackSparrow.equals(type)) {
			return new BlackSparrow();
		} else if (Constants.Animals.Birds.Pelican.equals(type)) {
			return new Pelican();
		} else {
			throw new Exception("Invalid animal exception!");
		}
	}
}