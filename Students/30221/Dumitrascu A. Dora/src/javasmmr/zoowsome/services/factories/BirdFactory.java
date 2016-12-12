package javasmmr.zoowsome.services.factories;
import javasmmr.zoowsome.models.animals.*;


public class BirdFactory extends SpeciesFactory{
	public Animals getAnimal(String type)throws Exception{
		if(Constants.Animal.Birds.Penguin.equals(type)){
			return new Penguin();
		}
		else if(Constants.Animal.Birds.Vulture.equals(type)){
			return new Vulture();
		}
		else if(Constants.Animal.Birds.Parrot.equals(type)){
			return new Parrot();
			}
		
		else {
			throw new Exception("Invalid animal exception!");
		}
	}
}
