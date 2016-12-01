package javasmmr.zoowsome.services.factories;
import javasmmr.zoowsome.models.animals.*;
public class BirdFactory extends SpeciesFactory{
public Animal getAnimal(String type) throws Exception{
	if(Constants.Animals.Birds.Flamingo.equals(type)){
		return new Flamingo();
	}else if (Constants.Animals.Birds.Penguin.equals(type)){
		return new Penguin();
	}else if (Constants.Animals.Birds.Dodo.equals(type)){
		return new Dodo();
	}else{	
		throw new Exception("Invalid animal exception!");
	}
}
}
