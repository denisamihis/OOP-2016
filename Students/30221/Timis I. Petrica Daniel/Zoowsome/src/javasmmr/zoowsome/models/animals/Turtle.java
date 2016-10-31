package javasmmr.zoowsome.models.animals;

public class Turtle extends Reptile {
	
	public Turtle(Integer nrOfLegs, String name, boolean layEggs, Double maintenanceCost, Double dangerPerc) {
		super(maintenanceCost, dangerPerc);
		setNrOfLegs(nrOfLegs);
		setName(name);
		setLayEggs(layEggs);
	}
	
	public Turtle() {
		super(2.9, 0.0);
		setNrOfLegs(4);
		setName("Turtle");
		setLayEggs(true);
	}

}
