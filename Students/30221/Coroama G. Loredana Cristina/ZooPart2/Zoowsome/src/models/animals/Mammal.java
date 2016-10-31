package models.animals;

abstract public class Mammal extends Animal {
	
	
	public Mammal(double mn, double dp) {
		super(mn,dp);

		// TODO Auto-generated constructor stub
	}
	public float normalBodyTemp;
	public float percBodyHair;
	public float getNormalBodyTemp() {
		return normalBodyTemp;
	}
	public void setNormalBodyTemp(float normalBodyTemp) {
		this.normalBodyTemp = normalBodyTemp;
	}
	public float getPercBodyHair() {
		return percBodyHair;
	}
	public void setPercBodyHair(float percBodyHair) {
		this.percBodyHair = percBodyHair;
	}
	

}
