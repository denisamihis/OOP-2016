package javasmmr.zoowsome.models.animals;

abstract class Insect extends Animal{
	protected boolean canFly;
	protected boolean isDangerous;
	
	public Insect(double maintenanceCost, double dangerPerc){
		super(maintenanceCost,dangerPerc);
	}
	
	public boolean getCanFly(){
		return canFly;
	}
	
	public boolean getIsDangerous(){
		return isDangerous;
	}
	
	public void setCanFly(boolean canFly){
		this.canFly=canFly;
	}
	
	public void setIsDangerous(boolean isDangerous){
		this.isDangerous=isDangerous;
	}
}
