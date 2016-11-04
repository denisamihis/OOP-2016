package javasmmr.zoowsome.models.animals;

public abstract class Insect extends Animal {

	private boolean canFly;
	private boolean isDangerous;
	
	public Insect(Double maintenanceCost, Double dangerPerc) {
		super(maintenanceCost, dangerPerc);
	}
	
	public boolean getCanFly() {
		return canFly;
	}
	
	public void setCanFly(boolean canFly) {
		this.canFly = canFly;
	}
	
	public boolean getIsDangerous() {
		return isDangerous;
	}
	
	public void setIsDangerous(boolean isDangerous) {
		this.isDangerous = isDangerous;
	}
	
}
