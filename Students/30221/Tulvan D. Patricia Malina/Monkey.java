package javasmmr.zoowsome.models.animals;

public class Monkey extends Mammal {
	public Monkey(){
		super(6.3,0.42);
		setNrOfLegs(2);
		setName("Monkey");
		setNormalBodyTemp(37.2f);
		setPercBodyHair(88.1f);
	}
	
	public Monkey(Integer nrOfLegs, String name,Float normalBodyTemp, Float percBodyHair,Double maintenanceCost, Double dangerPerc){
		super(maintenanceCost,dangerPerc);
		setNrOfLegs(nrOfLegs);
		setName(name);
		setNormalBodyTemp(normalBodyTemp);
		setPercBodyHair(percBodyHair);
	}
}
