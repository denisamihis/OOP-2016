package javasmmr.zoowsome.models.animals;

public class Chameleon extends Reptile {
	public Chameleon (int nrOfLegs, String name, boolean laysEggs, double maintenanceCost, double dangerPerc){
		super(maintenanceCost, dangerPerc);
		setNrOfLegs(nrOfLegs);
		setName(name);
		setLaysEggs(laysEggs);
	}
	
	public Chameleon (){
		super(2.1, 0.0);
		setNrOfLegs(4);
		setName("Chameleon");
		setLaysEggs(true);
	}
	
	

}
