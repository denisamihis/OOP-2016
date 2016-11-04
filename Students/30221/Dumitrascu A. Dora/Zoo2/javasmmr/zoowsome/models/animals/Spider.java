package javasmmr.zoowsome.models.animals;

public class Spider extends Insect{
	public Spider(){
		super(0.3,0.3);
		setNrOfLegs(8);
		setName("Spider");
		setCanFly(false);
		setIsDangerous(false);
	}
	
	public Spider(int nrOfLegs, String name, boolean canFly, boolean isDangerous,double maintenanceCost,double dangerPerc){
		super(maintenanceCost,dangerPerc);
		this.nrOfLegs=nrOfLegs;
		this.name=name;
		this.canFly=canFly;
		this.isDangerous=isDangerous;
	}

}

