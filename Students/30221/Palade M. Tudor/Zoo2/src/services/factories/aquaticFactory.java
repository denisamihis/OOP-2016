package services.factories;
import models.animals.*;
public class aquaticFactory extends SpeciesFactory{
	public animals getAnimal (String type) throws Exception{
		if (Constants.Animals.Aquatics.Dolphin.equals(type)){
			return new dolphin();
		}
		else if (Constants.Animals.Aquatics.Shark.equals(type)){
			return new shark();
		}
		else if (Constants.Animals.Aquatics.Tuna.equals(type)){
			return new tuna();
		}
		else
			throw new Exception("Invalid animal exception!");
	}
}