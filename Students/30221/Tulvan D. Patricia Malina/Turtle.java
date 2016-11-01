package javasmmr.zoowsome.models.animals;

public class Turtle extends Reptile{

	public Turtle(){
		super(3.9,0.0);
		setNrOfLegs(04);
		setName("Turtle");
		setLayEggs(Boolean.TRUE);
	}
	
	public Turtle(Integer nrOfLegs,String name,Boolean layEggs,Double maintenanceCost, Double dangerPerc){
		super(maintenanceCost,dangerPerc);
		setNrOfLegs(nrOfLegs);
		setName(name);
		setLayEggs(layEggs);
	}
}
