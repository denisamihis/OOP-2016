package javasmmr.zoowsome.models.animals;

public class Tiger extends Mammal{
	public Tiger(){
		setNrOfLegs(4);
		setName("Tiger");
		setNormalBodyTemp(37.0f);
		setPercBodyHair(95.3f);
	}
	
	public Tiger(Integer nrOfLegs, String name, Float normalBodyTemp, Float percBodyHair ){
		setNrOfLegs(nrOfLegs);
		setName(name);
		setNormalBodyTemp(normalBodyTemp);
		setPercBodyHair(percBodyHair);
	}
}
