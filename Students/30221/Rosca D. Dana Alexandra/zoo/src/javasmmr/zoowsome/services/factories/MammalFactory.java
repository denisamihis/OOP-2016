package javasmmr.zoowsome.services.factories;
import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.models.animals.Cow;
import javasmmr.zoowsome.models.animals.Monkey;
import javasmmr.zoowsome.models.animals.Tiger;

public class MammalFactory extends SpeciesFactory{
	
	public Animal getAnimal(String type) throws Exception {
		 if(Constants.Animals.Mammal.Tiger.equals(type))
		 return new Tiger();
		 else
		 if(Constants.Animals.Mammal.Monkey.equals(type))
		 return new Monkey();
		 else
		 if(Constants.Animals.Mammal.Cow.equals(type))
		 return new Cow();
		 	else 
					throw new Exception("Invalid animal exception!");	
	}
}
