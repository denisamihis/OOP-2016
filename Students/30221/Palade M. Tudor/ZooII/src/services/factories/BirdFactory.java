package services.factories;
import models.animals.*;
public class BirdFactory extends SpeciesFactory{
	public Animal getAnimal (String type) throws Exception{
		if (Constants.Animals.Birds.Peacock.equals(type)){
			return new Peacock();
		}
		else if (Constants.Animals.Birds.Eagle.equals(type)){
			return new Eagle();
		}
		else if (Constants.Animals.Birds.Flamingo.equals(type)){
			return new Flamingo();
		}
		else
			throw new Exception("Invalid animal exception!");
	}
}