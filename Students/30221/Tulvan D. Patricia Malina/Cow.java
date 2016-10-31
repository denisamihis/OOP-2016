package javasmmr.zoowsome.models.animals;

public class Cow extends Mammal{
	public Cow(){
		setNrOfLegs(4);
		setName("Cow");
		setNormalBodyTemp(37.0f);
		setPercBodyHair(77.5f);
	}
	
	public Cow(Integer nrOfLegs, String name, Float normalBodyTemp, Float percBodyHair ){
		setNrOfLegs(nrOfLegs);
		setName(name);
		setNormalBodyTemp(normalBodyTemp);
		setPercBodyHair(percBodyHair);
	}
}
