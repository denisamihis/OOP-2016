package services.factories;
import models.animals.*;

public class MammalFactory extends SpeciesFactory{
	public Animal getAnimal(String type) throws Exception{
		if (Constants.Animals.Mammals.Kangaroo.equals(type)){
			return new Kangaroo();
		}
		else if (Constants.Animals.Mammals.Lion.equals(type)){
			return new Lion();
		}
		else if (Constants.Animals.Mammals.Tiger.equals(type)){
			return new Tiger();
		}
		else
			throw new Exception("Invalid animal exception!");
	}
}
