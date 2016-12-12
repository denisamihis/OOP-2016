package services.factories;
import models.animals.*;

public class MammalFactory extends SpeciesFactory{
	public Animal getAnimal(String type) throws Exception{
		if (Constants.Animals.Mammals.Cow.equals(type)){
			return new Cow();
		}
		else if (Constants.Animals.Mammals.Monkey.equals(type)){
			return new Monkey();
		}
		else if (Constants.Animals.Mammals.Tiger.equals(type)){
			return new Tiger();
		}
		else
			throw new Exception("Invalid animal exception!");
	}
}