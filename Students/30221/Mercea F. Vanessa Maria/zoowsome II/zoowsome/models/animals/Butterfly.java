package animals;

public class Butterfly extends Insect {
	public Butterfly() {
		super(1.0,0.0001);
		setNrOfLegs(6);
		setName("Butterfly");
		setCanFly(true);
		setIsDangerous(false);
	}
	
	public Butterfly(Integer nrOfLegs, String name, Double maintenanceCost, Double dangerPerc, boolean canFly, boolean isDangerous) {
		super(maintenanceCost,dangerPerc);
		setNrOfLegs(nrOfLegs);
		setName(name);
		setCanFly(canFly);
		setIsDangerous(isDangerous);
	}
	
}
