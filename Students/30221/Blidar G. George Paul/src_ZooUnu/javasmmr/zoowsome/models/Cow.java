package javasmmr.zoowsome.models;

public class Cow extends Mammal {
	
	public Cow()
	{
		;
	}
	
	public Cow(String name,float normallyTemp, float percentage)
	{
		this.setNumberOfLegs(4);
		this.setNormalBodyTemp(normallyTemp);
		this.setPercBodyHair(percentage);
		this.setName(name);
	}
}