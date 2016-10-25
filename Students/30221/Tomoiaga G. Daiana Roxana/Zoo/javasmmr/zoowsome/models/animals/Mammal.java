package javasmmr.zoowsome.models.animals;

public abstract class Mammal extends Animal {
	protected float normalBodyTemp;
	protected float percBodyHair;
	
	public float getNormalBodyTemp () {
		return normalBodyTemp;
	}
	
	public void setNormalBodyTemp (int normalBodyTemp) {
		this.normalBodyTemp = normalBodyTemp;
	}
	
	public float getPercBodyHair () {
		return percBodyHair;
	}
	
	public void setPercBodyHair (int percBodyHair) {
		this.percBodyHair = percBodyHair;
	}



}
