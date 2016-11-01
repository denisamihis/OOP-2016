package animals;

public abstract class Insect extends Animal {
	private Boolean canFly;
	private Boolean isDangerous;

	public Insect(Double maintenaceCost, Double dangerPerc) {
		super(maintenaceCost, dangerPerc);
	}

	public Boolean getCanFly() {
		return canFly;
	}

	public void setCanFly(Boolean possibilityOfFlight) {
		canFly = possibilityOfFlight;
	}

	public Boolean getIsDangerous() {
		return isDangerous;
	}

	public void setIsDangerous(Boolean possibilityOfDanger) {
		isDangerous = possibilityOfDanger;
	}
}