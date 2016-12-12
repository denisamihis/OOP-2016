package javasmmr.zoowsome.models.animals;

public class Butterfly extends Insect{
	public Butterfly(){
		super(1.0,0.0);
		setNrOfLegs(6);
		setName("Butterfly");
		setCanFly(Boolean.TRUE);
		setIsDangerous(Boolean.FALSE);
	}
	
	public Butterfly(Integer nrOfLegs, String name, Boolean canFly, Boolean isDangerous,Double maintenanceCost, Double dangerPerc){
		super(maintenanceCost,dangerPerc);
		setNrOfLegs(nrOfLegs);
		setName(name);
		setCanFly(canFly);
		setIsDangerous(isDangerous);
	}
}
