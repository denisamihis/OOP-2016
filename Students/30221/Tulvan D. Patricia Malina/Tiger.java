package javasmmr.zoowsome.models.animals;

public class Tiger extends Mammal{
	public Tiger(){
		super(6.3,0.95);
		setNrOfLegs(4);
		setName("Tiger");
		setNormalBodyTemp(37.0f);
		setPercBodyHair(95.3f);
	}
	
	public Tiger(Integer nrOfLegs, String name, Float normalBodyTemp, Float percBodyHair,Double maintenanceCost, Double dangerPerc ){
		super(maintenanceCost,dangerPerc);
		setNrOfLegs(nrOfLegs);
		setName(name);
		setNormalBodyTemp(normalBodyTemp);
		setPercBodyHair(percBodyHair);
	}
}
