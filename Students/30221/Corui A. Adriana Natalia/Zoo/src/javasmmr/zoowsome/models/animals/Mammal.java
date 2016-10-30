package javasmmr.zoowsome.models.animals;

public class Mammal extends Animal {

	public Mammal(double maintCosts,double precDanger) {
		super(maintCosts, precDanger);
		// TODO Auto-generated constructor stub
	}
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
