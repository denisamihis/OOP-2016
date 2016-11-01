package javasmmr.zoowsome.models.animals;

public class Spider extends Insect {
	public Spider(){
		super(2.1,0.55);
		setNrOfLegs(8);
		setName("Spider");
		setCanFly(Boolean.FALSE);
		setIsDangerous(Boolean.TRUE);
	}
	
	public Spider(Integer nrOfLegs, String name, Boolean canFly, Boolean isDangerous,Double maintenanceCost, Double dangerPerc){
		super(maintenanceCost,dangerPerc);
		setNrOfLegs(nrOfLegs);
		setName(name);
		setCanFly(canFly);
		setIsDangerous(isDangerous);
	}
}
