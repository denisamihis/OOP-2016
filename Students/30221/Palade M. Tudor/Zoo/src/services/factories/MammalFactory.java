package services.factories;
import models.animals.*;

public class MammalFactory extends SpeciesFactory{
	public animals getAnimal(String type) throws Exception{
		if (Constants.Animals.Mammals.Cow.equals(type)){
			return new cow();
		}
		else if (Constants.Animals.Mammals.Monkey.equals(type)){
			return new monkey();
		}
		else if (Constants.Animals.Mammals.Tiger.equals(type)){
			return new tiger();
		}
		else
			throw new Exception("Invalid animal exception!");
	}
}