package javasmmr.zoowsome.models.animals;

public class Lizard extends Reptile{

	public Lizard(){
		super(3.3,0.1);
		setNrOfLegs(4);
		setName("Lizard");
		setLayEggs(Boolean.TRUE);
	}
	
	public Lizard(Integer nrOfLegs,String name,Boolean layEggs,Double maintenanceCost, Double dangerPerc){
		super(maintenanceCost,dangerPerc);
		setNrOfLegs(nrOfLegs);
		setName(name);
		setLayEggs(layEggs);
	}
}
