package javasmmr.zoowsome.models.animals;

public class Chameleon extends Reptile{
	public Chameleon(){
		super(3,0.1);
		setNrOfLegs(4);
		setName("Chameleon");
		setLaysEggs(true);
	}
	
	public Chameleon(int nrOfLegs, String name, boolean laysEggs,double maintenanceCost,double dangerPerc){
		super(maintenanceCost,dangerPerc);
		this.nrOfLegs=nrOfLegs;
		this.name=name;
		this.laysEggs=laysEggs;
	}
}
