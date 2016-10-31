package javasmmr.zoowsome.models;

public class Tiger extends Mammal {
	
	public Tiger()
	{
		this("TIGER",40,99);
	}
	
	public Tiger(String name,float normallyTemp, float percentage)
	{
		this.setNumberOfLegs(4);
		this.setNormalBodyTemp(normallyTemp);
		this.setPercBodyHair(percentage);
		this.setName(name);
	}
}