package javasmmr.zoowsome.models.animals;

public class Lizard extends Reptile {

	public Lizard(Integer nrOfLegs, String name, boolean layEggs, Double maintenanceCost, Double dangerPerc) {
		super(maintenanceCost, dangerPerc);
		setNrOfLegs(nrOfLegs);
		setName(name);
		setLayEggs(layEggs);
	}
	
	public Lizard() {
		super(1.0, 0.04);
		setNrOfLegs(4);
		setName("Lizard");
		setLayEggs(true);
	}
	
}
