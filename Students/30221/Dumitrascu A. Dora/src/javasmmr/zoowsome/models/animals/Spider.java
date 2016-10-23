package javasmmr.zoowsome.models.animals;

public class Spider extends Insect{
	public Spider(){
		setNrOfLegs(8);
		setName("Spider");
		setCanFly(false);
		setIsDangerous(false);
	}
	
	public Spider(int nrOfLegs, String name, boolean canFly, boolean isDangerous){
		this.nrOfLegs=nrOfLegs;
		this.name=name;
		this.canFly=canFly;
		this.isDangerous=isDangerous;
	}

}

