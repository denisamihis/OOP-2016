package javasmmr.zoowsome.models;

public class Spider extends Insect {
	
	public Spider()
	{
		this("SPIDER",false,true);
	}
	
	public Spider(String name, boolean answer1, boolean answer2)
	{
		this.setNumberOfLegs(8);
		this.setName(name);
		this.setIsFlying(answer1);
		this.setItIsDangerous(answer2);
	}
}