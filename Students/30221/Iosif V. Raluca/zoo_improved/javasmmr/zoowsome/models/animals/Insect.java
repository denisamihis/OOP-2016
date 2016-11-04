package javasmmr.zoowsome.models.animals;

public abstract class Insect extends Animal {
	private boolean canFly;
	private boolean isDangerous;
	
	public boolean getCanFly(){
		return canFly;
	}
	
	public boolean getIsDangerous(){
		return isDangerous;
	}
	
	public void setCanFLy(boolean canFly){
		this.canFly=canFly;
	}
	
	public void setIsDangerous(boolean isDangerous){
		this.isDangerous=isDangerous;
	}
	
	
}
