package javasmmr.zoowsome.models.animals;

public class Cow extends Mammal{
	public Cow(){
		super(3.5,0.0);
		setNrOfLegs(4);
		setName("Cow");
		setNormalBodyTemp(37.0f);
		setPercBodyHair(77.5f);
	}
	
	public Cow(Integer nrOfLegs, String name, Float normalBodyTemp, Float percBodyHair,Double maintenanceCost, Double dangerPerc ){
		super(maintenanceCost,dangerPerc);
		setNrOfLegs(nrOfLegs);
		setName(name);
		setNormalBodyTemp(normalBodyTemp);
		setPercBodyHair(percBodyHair);
	}
}
