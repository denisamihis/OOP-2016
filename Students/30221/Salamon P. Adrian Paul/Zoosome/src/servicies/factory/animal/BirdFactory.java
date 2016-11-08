package servicies.factory.animal;

import models.animals.Animal;
import models.animals.Hen;
import models.animals.Pigeon;
import models.animals.Turkey;

public class BirdFactory extends SpeciesFactory {
	
	public Animal getAnimal(String type) {
		if (Constants.Animals.Birds.Hen.equals(type)) {
			return new Hen();

		} else if (Constants.Animals.Birds.Pigeon.equals(type)) {

			return new Pigeon();
			

		} else if (Constants.Animals.Birds.Turkey.equals(type)) {
			return new Turkey();
		}
		return null;
	}
}
