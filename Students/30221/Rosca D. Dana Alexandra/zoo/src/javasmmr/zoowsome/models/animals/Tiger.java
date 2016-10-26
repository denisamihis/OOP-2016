package javasmmr.zoowsome.models.animals;

public class Tiger extends Mammal{
	public Tiger(){
		setNrLegs(4);
		setName("Tiger");
		setNormalBodyTemp(38.0f);
		setPercBodyHair(98.3f);
	}

	public Tiger(Integer nrOfLegs, String name, Float normalBodyTemp, Float percBodyHair ){
		setNrLegs(nrOfLegs);
		setName(name);
		setNormalBodyTemp(normalBodyTemp);
		setPercBodyHair(percBodyHair);
	}
}
