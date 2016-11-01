package models.animals;

public abstract class Insect extends Animal{
	public Insect(double mc, double dp) {
		super(mc, dp);
		// TODO Auto-generated constructor stub
	}
	public boolean canFly;		//Can it fly?
	public boolean isDangerous;		//Is it dangerous? 
	public boolean isCanFly() {
		return canFly;
	}
	public void setCanFly(boolean canFly) {
		this.canFly = canFly;
	}
	public boolean isDangerous() {
		return isDangerous;
	}
	public void setDangerous(boolean isDangerous) {
		this.isDangerous = isDangerous;
	}
}
