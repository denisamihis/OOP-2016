package models.animals;

public abstract class Insect extends Animal {
	Boolean canFly;
	Boolean isDangerous;

	public void setCanFly(Boolean canFly) {
		this.canFly = canFly;

	}

	public void setIsDangerous(Boolean isDangerous) {
		this.isDangerous = isDangerous;
	}

	public Boolean getCanFly() {
		return canFly;
	}

	public Boolean getIsDangerous() {
		return isDangerous;
	}

}
