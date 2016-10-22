package services.factories;
import models.animals.*;
public class BirdFactory extends SpeciesFactory{
	public Animal getAnimal (String type) throws Exception{
		if (Constants.Animals.Birds.Eagle.equals(type)){
			return new Eagle();
		}
		else if (Constants.Animals.Birds.Emu.equals(type)){
			return new Emu();
		}
		else if (Constants.Animals.Birds.Peacock.equals(type)){
			return new Peacock();
		}
		else
			throw new Exception("Invalid animal exception!");
	}
}
