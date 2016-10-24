package javasmmr.zoowsome.models.animals;

public class Mammal extends Animal {

	private float normalBodyTemp;
	private float precBodyHair;
	public float getBodyTemp()
	{
		return normalBodyTemp;
	}
	public void setBodyTemp(float normalBodyTemp)
	{
		this.normalBodyTemp=normalBodyTemp;
	}
	public float getPrecBodyHair()
	{
		return precBodyHair; 
	}
	public void setPrecBodyHair(float precBodyHair)
	{
		this.precBodyHair=precBodyHair;
	}
}
