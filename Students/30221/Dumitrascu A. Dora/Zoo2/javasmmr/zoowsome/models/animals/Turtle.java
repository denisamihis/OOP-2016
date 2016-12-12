package javasmmr.zoowsome.models.animals;

public class Turtle extends Reptile{
	public Turtle(){
		super(6.2,0.1);
		setNrOfLegs(4);
		setName("Turtle");
		setLaysEggs(true);
	}
	
	public Turtle(int nrOfLegs, String name, boolean laysEggs,double maintenanceCost,double dangerPerc){
		super(maintenanceCost,dangerPerc);
		this.nrOfLegs=nrOfLegs;
		this.name=name;
		this.laysEggs=laysEggs;
	}
}
