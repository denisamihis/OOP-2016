package javasmmr.zoowsome.models;

public class Tiger extends Mammal {
	
	public Tiger()
	{
		;
	}
	
	public Tiger(String name,float normallyTemp, float percentage)
	{
		this.setNumberOfLegs(4);
		this.setNormalBodyTemp(normallyTemp);
		this.setPercBodyHair(percentage);
		this.setName(name);
	}
}