package javasmmr.zoowsome.services.factories;
import javasmmr.zoowsome.models.animals.*;

public class MammalFactory extends SpeciesFactory{
	@Override
	public Animals getAnimal(String type)throws Exception{
		if(Constants.Animal.Mammal.Cow.equals(type)){
			return new Cow();
		}
		else if(Constants.Animal.Mammal.Monkey.equals(type)){
			return new Monkey();
		}
		else if(Constants.Animal.Mammal.Tiger.equals(type)){
			return new Tiger();
		}
		else{
			throw new Exception("Invalid animal exception!");
		}
	}
}
