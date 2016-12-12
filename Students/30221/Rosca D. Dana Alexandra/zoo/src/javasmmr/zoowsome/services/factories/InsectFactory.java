package javasmmr.zoowsome.services.factories;
import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.models.animals.Cockroach;
import javasmmr.zoowsome.models.animals.Butterfly;
import javasmmr.zoowsome.models.animals.Spider;
public class InsectFactory extends SpeciesFactory{
	public Animal getAnimal(String type) throws Exception{
		 if(Constants.Animals.Insect.Butterfly.equals(type))
		 return new Butterfly();
		else
		 	if(Constants.Animals.Insect.Spider.equals(type))
		 	return new Spider();
	else
		 	if(Constants.Animals.Insect.Cockroach.equals(type))
		 		return new Cockroach();
			else 
		 		throw new Exception("Invalid animal exception!");	
		 }
}
