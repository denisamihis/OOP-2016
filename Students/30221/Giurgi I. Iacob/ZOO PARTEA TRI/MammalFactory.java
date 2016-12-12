package javasmmr.zoowsome.services.factories;

import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.models.animals.Cow;
import javasmmr.zoowsome.models.animals.Monkey;
import javasmmr.zoowsome.models.animals.Tiger;

public class MammalFactory extends SpeciesFactory {
		public Animal getAnimal(String type) {
		     if (Constants.Animals.Mammals.Cow.equals(type)) {
		             return new Cow(); // leave empty constructor, for now!
		     } else if (Constants.Animals.Mammals.Tiger.equals(type)) {
		             return new Tiger();
		     }else if (Constants.Animals.Mammals.Monkey.equals(type)) {
			        return new Monkey();
		    } else return null;
}
}

