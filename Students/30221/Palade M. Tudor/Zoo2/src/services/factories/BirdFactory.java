package services.factories;
import models.animals.*;
public class BirdFactory extends SpeciesFactory{
	public animals getAnimal (String type) throws Exception{
		if (Constants.Animals.Birds.Eagle.equals(type)){
			return new eagle();
		}
		else if (Constants.Animals.Birds.Chicken.equals(type)){
			return new chicken();
		}
		else if (Constants.Animals.Birds.Duck.equals(type)){
			return new duck();
		}
		else
			throw new Exception("Invalid animal exception!");
	}
}