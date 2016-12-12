package javasmmr.zoowsome.models.animals;

public abstract class Insect extends Animal {
	private boolean canFly;
	private boolean isDangerous;
	
	public boolean getCanFly(){
		return canFly;
	}
	
	public void setCanFly(boolean fly){
		canFly=fly;
	}
	
	public boolean getIsDangerous(){
		return isDangerous;
	}
	
	public void setIsDangerous(boolean dangerous){
		isDangerous=dangerous;
	}

}
