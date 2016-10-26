package javasmmr.zoowsome.services.factories;

public class MammalFactory extends SpeciesFactory{
	public Animal getAnimal(String type){
		if(Constants.Animals.Mammals.Lion.equals(type))
		{
			return new Lion();
		}
		else if(Constants.Animals.Mammals.Giraffe.equals(type))
		{
			return new Giraffe();
		}
		else {
			throw new Exception("Invalid animal exception!");
		}
	}

}
