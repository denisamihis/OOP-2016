package javasmmr.zoowsome.models.animals;

public abstract class Mammal extends Animal{
	private float  normalBodyTemp;
	private float percBodyHair;

	public Mammal(String name, int numberOfLegs,float  normalBodyTemp,float percBodyHair) {
		super(name, numberOfLegs);
		setBodyTemp(normalBodyTemp);
		setBodyHair(percBodyHair);
	}
	public  void setBodyTemp(float  normalBodyTemp)
	{
		this.normalBodyTemp=normalBodyTemp;
	}
	public void setBodyHair(float percBodyHair)
	{
		 this.percBodyHair=percBodyHair;
	}
	public  float getBodyTemp(float getBodyHair)
	{
		return getBodyHair;
	}
	public float getBodyHair(float percBodyHair)
	{
		 return percBodyHair;
	}
}


