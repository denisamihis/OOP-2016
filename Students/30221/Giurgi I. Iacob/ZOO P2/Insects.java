package javasmmr.zoowsome.models.animals;
public abstract class Insects extends Animal {
	public boolean canFly;
	public boolean isDangerous;
	
	public Insects(boolean canFly,boolean isDangerous,int nrOfLegs,String name,double maintenanceCost,double dangerPerc){
		super(nrOfLegs,name,maintenanceCost,dangerPerc);
		this.canFly=canFly;
		this.isDangerous=isDangerous;
	}
	
	public boolean getCanFly(){
		return canFly;
	}
	public boolean getIsDangerous(){
		return isDangerous;
	}

}
