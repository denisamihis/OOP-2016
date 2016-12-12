package javasmmr.zoowsome.services.factories;
import javasmmr.zoowsome.models.animals.*;
public class InsectFactory extends SpeciesFactory{
public Animal getAnimal(String type) throws Exception{
	if(Constants.Animals.Insects.Butterfly.equals(type)){
		return new Butterfly();
	}else if (Constants.Animals.Insects.Caterpillar.equals(type)){
		return new Caterpillar();
	}else if (Constants.Animals.Insects.Ant.equals(type)){
		return new Ant();
	}else{	
		throw new Exception("Invalid animal exception!");
	}
}
}
