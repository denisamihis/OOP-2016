package javasmmr.zoowsome.services.factories;
import javasmmr.zoowsome.models.animals.*;
public class MammalFactory extends SpeciesFactory{
public Animal getAnimal(String type) throws Exception{
	if(Constants.Animals.Mammals.Bear.equals(type)){
		return new Bear();
	}else if (Constants.Animals.Mammals.Platypus.equals(type)){
		return new Platypus();
	}else if (Constants.Animals.Mammals.Cow.equals(type)){
		return new Cow();
	}else{	
		throw new Exception("Invalid animal exception!");
	}
}
}
