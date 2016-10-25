package factories;

import animals.Animal;
import animals.JellyFish;
import animals.KoiFish;
import animals.SeaTurtle;

public class AquaticFactory extends SpeciesFactory {
	@Override
	public Animal getAnimal(String type) throws Exception {
		if (Constants.Animals.Aquatics.SeaTurtle.equals(type)) {
			return new SeaTurtle(); // leave empty constructor, for now!
		} else if (Constants.Animals.Aquatics.JellyFish.equals(type)) {
			return new JellyFish();
		} else if (Constants.Animals.Aquatics.KoiFish.equals(type)) {
			return new KoiFish();
		} else {
			throw new Exception("Invalid animal exception!");
		}
	}
}