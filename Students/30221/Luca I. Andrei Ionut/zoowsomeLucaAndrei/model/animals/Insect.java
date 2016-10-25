package animals;

public abstract class Insect extends Animal {
	private Boolean canFly;
	private Boolean isDangerous;

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