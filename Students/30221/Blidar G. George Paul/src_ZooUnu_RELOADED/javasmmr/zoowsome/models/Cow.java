package javasmmr.zoowsome.models;

public class Cow extends Mammal {
	
	public Cow()
	{
		this("COW",36,95);
	}
	
	public Cow(String name,float normallyTemp, float percentage)
	{
		this.setNumberOfLegs(4);
		this.setNormalBodyTemp(normallyTemp);
		this.setPercBodyHair(percentage);
		this.setName(name);
	}
}