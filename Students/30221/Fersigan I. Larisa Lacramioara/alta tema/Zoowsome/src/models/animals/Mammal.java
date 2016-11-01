package models.animals;

public abstract class Mammal extends Animal  {
	public Mammal(double mc, double dp) {
		super(mc, dp);
		// TODO Auto-generated constructor stub
	}
	private float normalBodyTemp;	//Normal body temperature
	private float percBodyHair;		//% of body covered in hair
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
