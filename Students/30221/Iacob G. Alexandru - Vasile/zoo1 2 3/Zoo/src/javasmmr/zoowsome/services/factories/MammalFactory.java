package javasmmr.zoowsome.services.factories;

import javasmmr.zoowsome.controllers.Constants;
import javasmmr.zoowsome.models.animals.*;

public class MammalFactory extends SpeciesFactory {
	public Animal getAnimal (String type) throws Exception {
		if(Constants.Animals.Mammals.COW.equals(type)) {
			return new Cow();
		} else if (Constants.Animals.Mammals.MONKEY.equals(type)) {
			return new Monkey();
		} else if (Constants.Animals.Mammals.TIGER.equals(type)) {
			return new Tiger();
		} else {
			throw new Exception ("Invalid animal exception!");
		}
	}
}
