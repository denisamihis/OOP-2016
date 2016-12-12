package javasmmr.zoowsome.models.animals;

public class Cockroach extends Insect{
	public Cockroach(){
		super(0.5,0.0);
		setNrOfLegs(6);
		setName("Cockroach");
		setCanFly(Boolean.FALSE);
		setIsDangerous(Boolean.FALSE);
	}
	
	public Cockroach(Integer nrOfLegs, String name, Boolean canFly, Boolean isDangerous,Double maintenanceCost, Double dangerPerc){
		super(maintenanceCost,dangerPerc);
		setNrOfLegs(nrOfLegs);
		setName(name);
		setCanFly(canFly);
		setIsDangerous(isDangerous);
	}
}
