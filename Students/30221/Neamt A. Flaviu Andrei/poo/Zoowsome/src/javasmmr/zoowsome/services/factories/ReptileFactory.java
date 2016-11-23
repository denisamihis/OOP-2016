package javasmmr.zoowsome.services.factories;
import javasmmr.zoowsome.models.animals.*;
public class ReptileFactory extends SpeciesFactory{
public Animal getAnimal(String type) throws Exception{
	if(Constants.Animals.Reptiles.Salamander.equals(type)){
		return new Salamander();
	}else if (Constants.Animals.Reptiles.Turtle.equals(type)){
		return new Turtle();
	}else if (Constants.Animals.Reptiles.Lizard.equals(type)){
		return new Lizard();
	}else{	
		throw new Exception("Invalid animal exception!");
	}
}
}
