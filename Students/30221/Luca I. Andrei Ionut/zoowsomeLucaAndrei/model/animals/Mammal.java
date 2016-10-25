package animals;

public abstract class Mammal extends Animal {
	private float normalBodyTemp;
	private float percBodyHair;

	public float getNormalBodyTemp() {
		return normalBodyTemp;
	}

	public void setNormalBodyTemp(float bodyTemp) {
		normalBodyTemp = bodyTemp;
	}

	public float getPercBodyHair() {
		return percBodyHair;
	}

	public void setPercBodyHair(float bodyHair) {
		percBodyHair = bodyHair;
	}
}