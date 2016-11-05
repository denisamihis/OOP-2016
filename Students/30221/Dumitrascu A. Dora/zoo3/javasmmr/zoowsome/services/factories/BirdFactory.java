package javasmmr.zoowsome.services.factories;
import javasmmr.zoowsome.models.animals.*;


public class BirdFactory extends SpeciesFactory{
	public Animal getAnimal(String type)throws Exception{
		if(Constants.Animals.Birds.Penguin.equals(type)){
			return new Penguin();
		}
		else if(Constants.Animals.Birds.Vulture.equals(type)){
			return new Vulture();
		}
		else if(Constants.Animals.Birds.Parrot.equals(type)){
			return new Parrot();
			}
		
		else {
			throw new Exception("Invalid animal exception!");
		}
	}
}
