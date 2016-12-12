package javasmmr.zoowsome.services.factories;
import javasmmr.zoowsome.models.animals.*;

public class BirdFactory  extends SpeciesFactory{
	public Animal getAnimal(String type) throws Exception{
		if(Constants.Animals.Birds.Parrot.equals(type)){
			return new Parrot();
		}
		else if(Constants.Animals.Birds.Eagle.equals(type)){
			return new Eagle();
		}
		else if(Constants.Animals.Birds.Tucan.equals(type)){
			return new Tucan();
		}
		else{
			throw new Exception("Invalid animal exception!");
		}
	}

}
