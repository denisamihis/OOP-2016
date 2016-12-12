package javasmmr.zoowsome.models.animals;

public class Cockroach extends Insect{
	public Cockroach(){
		setNrOfLegs(6);
		setName("Cockroach");
		setCanFly(false);
		setIsDangerous(false);
	}
	
	public Cockroach(int nrOfLegs, String name, boolean canFly, boolean isDangerous){
		this.nrOfLegs=nrOfLegs;
		this.name=name;
		this.canFly=canFly;
		this.isDangerous=isDangerous;
	}

}
