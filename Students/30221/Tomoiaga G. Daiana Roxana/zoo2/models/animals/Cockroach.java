package javasmmr.zoowsome.models.animals;

public class Cockroach extends Insect {
	
	public Cockroach (boolean canFly, boolean isDangerous, String name, int nrOfLegs, double maintenanceCost, double dangerPerc){
		super(maintenanceCost, dangerPerc);
		setNrOfLegs(nrOfLegs);
		setName(name);
		setCanFly(canFly);
		setIsDangerous(isDangerous);
	}
	
	public Cockroach (){
		super(1.2,0.0);
		setNrOfLegs(6);
		setName("Cockroach");
		setCanFly(false);
		setIsDangerous(false);
	}
}
