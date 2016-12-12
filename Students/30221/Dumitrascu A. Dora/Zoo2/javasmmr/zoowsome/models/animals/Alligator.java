package javasmmr.zoowsome.models.animals;

public class Alligator extends Reptile{
	public Alligator(){
		super(7,0.9);
		setNrOfLegs(4);
		setName("Alligator");
		setLaysEggs(true);
	}
	
	public Alligator(int nrOfLegs, String name, boolean laysEggs,double maintenanceCost, double dangerPerc){
		super(maintenanceCost,dangerPerc);
		this.nrOfLegs=nrOfLegs;
		this.name=name;
		this.laysEggs=laysEggs;
	}
}
