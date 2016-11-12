package javasmmr.zoowsome.models.animals;

public class Turtle extends Reptile {
	public Turtle (int nrOfLegs, String name, boolean laysEggs, double maintenanceCost, double dangerPerc){
		super(maintenanceCost, dangerPerc);
		setNrOfLegs(nrOfLegs);
		setName(name);
		setLaysEggs(laysEggs);
	}
	
	public Turtle (){
		super(4.2, 0.0);
		setNrOfLegs(4);
		setName("Turtle");
		setLaysEggs(true);
	}
	
}
