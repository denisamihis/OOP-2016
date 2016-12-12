package animals;

public abstract class Insect extends Animal {
	public Insect(Double maintenanceCost, Double dangerPerc) {
		super(maintenanceCost, dangerPerc);
	}

	private boolean canFly;
	private boolean isDangerous;

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
