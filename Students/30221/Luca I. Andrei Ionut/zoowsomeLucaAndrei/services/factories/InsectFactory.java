package factories;

import animals.Animal;
import animals.Beetle;
import animals.RedAnt;
import animals.StingBee;

public class InsectFactory extends SpeciesFactory{
	@Override
	public Animal getAnimal(String type) throws Exception {
		if (Constants.Animals.Insects.Beetle.equals(type)) {
			return new Beetle(); // leave empty constructor, for now!
		} else if (Constants.Animals.Insects.StingBee.equals(type)) {
			return new StingBee();
		} else if (Constants.Animals.Insects.RedAnt.equals(type)) {
			return new RedAnt();
		} else {
			throw new Exception("Invalid animal exception!");
		}
	}
}
