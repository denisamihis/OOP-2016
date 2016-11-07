package javasmmr.zoowsome.services.factories;
import javasmmr.zoowsome.models.animals.*;

public class BirdFactory extends SpeciesFactory{
	@Override
	public Animal getAnimal (String type) throws Exception {
		
		if (Constants.Animals.Birds.Colibri.equals(type)){
			return new Colibri();
		} else if (Constants.Animals.Birds.Pigeon.equals(type)){
			return new Pigeon();
		}else if (Constants.Animals.Birds.Vulture.equals(type)){
			return new Vulture();
		}
		else {
			throw new Exception ("Invalid animal exception!");
		}
	} 

}
