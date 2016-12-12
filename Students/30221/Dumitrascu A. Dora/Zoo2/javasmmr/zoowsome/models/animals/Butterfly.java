package javasmmr.zoowsome.models.animals;

public class Butterfly extends Insect{
	public Butterfly(){
		super(0.5,0);
		setNrOfLegs(6);
		setName("Butterfly");
		setCanFly(true);
		setIsDangerous(false);
	}
	
	public Butterfly(int nrOfLegs, String name, boolean canFly, boolean isDangerous,double maintenanceCost,double dangerPerc){
		super(maintenanceCost,dangerPerc);
		this.nrOfLegs=nrOfLegs;
		this.name=name;
		this.canFly=canFly;
		this.isDangerous=isDangerous;
	}

}
