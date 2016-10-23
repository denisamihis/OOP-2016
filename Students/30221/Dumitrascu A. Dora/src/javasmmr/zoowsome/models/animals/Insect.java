package javasmmr.zoowsome.models.animals;

abstract class Insect extends Animals{
	protected boolean canFly;
	protected boolean isDangerous;
	
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
