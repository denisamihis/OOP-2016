package javasmmr.zoowsome.services.factories;
import javasmmr.zoowsome.models.animals.*;
public class AquaticFactory extends SpeciesFactory{
public Animal getAnimal(String type) throws Exception{
	if(Constants.Animals.Aquaties.Shark.equals(type)){
		return new Shark();
	}else if (Constants.Animals.Aquaties.Shrimp.equals(type)){
		return new Shrimp();
	}else if (Constants.Animals.Aquaties.Salmon.equals(type)){
		return new Salmon();
	}else{	
		throw new Exception("Invalid animal exception!");
	}
}
}
