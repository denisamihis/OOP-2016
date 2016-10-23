package javasmmr.zoowsome.models;

public abstract class Mammal extends Animal {
	
	private float normalBodyTemp;
	private float percBodyHair;
	
	public float getNormalBodyTemp()
	{
		return normalBodyTemp;
	}
	
	public void setNormalBodyTemp(float degree)
	{
		normalBodyTemp = degree;
	}
	
	public float getPercBodyHair()
	{
		return percBodyHair;
	}
	
	public void setPercBodyHair(float percentage)
	{
		percBodyHair = percentage;
	}
}