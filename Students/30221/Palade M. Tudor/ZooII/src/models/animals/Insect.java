package models.animals;

abstract class Insect extends Animal{
	boolean canFly;
	boolean isDangerous;
	
	protected Insect(Double maintenanceCost, Double dangerPerc){
		super(maintenanceCost,dangerPerc);
	}
	
	public void setCanFly(boolean canFly){
		this.canFly = canFly;
	}
	public void setIsDangerous(boolean isDangerous){
		this.isDangerous = isDangerous;
	}
	
	public boolean setCanFly(){
		return canFly;
	}
	
	public boolean setIsDangerous(){
		return isDangerous;
	}
}
