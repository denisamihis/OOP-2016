package javasmmr.zoowsome.services.factories;
import javasmmr.zoowsome.models.animals.*;


public class MammalFactory extends SpeciesFactory {
	
	public Animal getAnimal(String type) throws Exception{
		
		if(Constants.Animals.Mammals.Lion.equals(type)){
			return new Lion();
		}
		else if(Constants.Animals.Mammals.Tiger.equals(type)){
			return new Tiger();
		}
		else if(Constants.Animals.Mammals.Panther.equals(type)){
			return new Panther();
		}
		else{
			throw new Exception("Invalid animal exception!");
		}
	}

}
