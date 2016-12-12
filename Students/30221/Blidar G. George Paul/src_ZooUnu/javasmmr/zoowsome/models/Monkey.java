package javasmmr.zoowsome.models;

public class Monkey extends Mammal {

	public Monkey()
	{
		;
	}
	
	public Monkey(String name, float normallyTemp, float percentage)
	{
		this.setNumberOfLegs(2);
		this.setNormalBodyTemp(normallyTemp);
		this.setPercBodyHair(percentage);
		this.setName(name);
	}
}