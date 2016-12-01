package services.factories;
import models.animals.*;
public class insectFactory extends SpeciesFactory{
	public animals getAnimal (String type) throws Exception{
		if (Constants.Animals.Insects.Butterfly.equals(type)){
			return new butterfly();
		}
		else if (Constants.Animals.Insects.Cockroach.equals(type)){
			return new cockroach();
		}
		else if (Constants.Animals.Insects.Spider.equals(type)){
			return new spider();
		}
		else
			throw new Exception("Invalid animal exception!");
	}
}