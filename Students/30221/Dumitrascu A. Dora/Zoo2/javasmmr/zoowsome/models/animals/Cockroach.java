package javasmmr.zoowsome.models.animals;

public class Cockroach extends Insect{
	public Cockroach(){
		super(1.8,0);
		setNrOfLegs(6);
		setName("Cockroach");
		setCanFly(false);
		setIsDangerous(false);
	}
	
	public Cockroach(int nrOfLegs, String name, boolean canFly, boolean isDangerous,double maintenanceCost,double dangerPerc){
		super(maintenanceCost,dangerPerc);
		this.nrOfLegs=nrOfLegs;
		this.name=name;
		this.canFly=canFly;
		this.isDangerous=isDangerous;
	}

}
