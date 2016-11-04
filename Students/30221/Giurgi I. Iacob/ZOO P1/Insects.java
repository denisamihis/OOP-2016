package javasmmr.zoowsome.models.animals;
public abstract class Insects extends Animal {
	public boolean canFly;
	public boolean isDangerous;
	
	public void setCanFly(boolean canFly){
		this.canFly=canFly;
	}
	
	public void setIsDangerous(boolean isDang){
		this.isDangerous=isDang;
	}
	
	public boolean getCanFly(){
		return canFly;
	}
	public boolean getIsDangerous(){
		return isDangerous;
	}

}
