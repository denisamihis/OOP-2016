package models.animals;

public abstract class Mammal extends Animal{
	protected float normalBodyTemp;
	protected float percBodyHair;
	public Mammal(double normalBodyTemp,double percBodyHair,String name)
	{
		super(name);
		this.normalBodyTemp = (float)normalBodyTemp;
		this.percBodyHair = (float)percBodyHair;
	}
	public float getNormalBodyTemp()
	{
		return normalBodyTemp;
	}
	public void setNormalBodyTemp(double normalBodyTemp)
	{
		this.normalBodyTemp = (float)normalBodyTemp;
	}
	public float getPercBodyHair()
	{
		return percBodyHair;
	}
	public void setPercBodyHair(double percBodyHair)
	{
		this.percBodyHair = (float)percBodyHair;
	}
}
