package javasmmr.zoowsome.models;

public class Butterfly extends Insect {
		
	public Butterfly()
	{
		;
	}
	
	public Butterfly(String name, boolean answer1, boolean answer2)
	{
		this.setNumberOfLegs(2);
		this.setName(name);
		this.setIsFlying(answer1);
		this.setItIsDangerous(answer2);
	}
}