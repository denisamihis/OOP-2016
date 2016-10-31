package javasmmr.zoowsome.models;

public class Wasp extends Insect {
	
	
	public Wasp()
	{
		this("WASP",true,true);
	}
	
	public Wasp(String name, boolean answer1, boolean answer2)
	{
		this.setNumberOfLegs(2);
		this.setName(name);
		this.setIsFlying(answer1);
		this.setItIsDangerous(answer2);
	}
}