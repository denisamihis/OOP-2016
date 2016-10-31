package javasmmr.zoowsome.models.animals;

public class Turtle extends Reptile{

	public Turtle(){
		setNrOfLegs(04);
		setName("Turtle");
		setLayEggs(Boolean.TRUE);
	}
	
	public Turtle(Integer nrOfLegs,String name,Boolean layEggs){
		setNrOfLegs(nrOfLegs);
		setName(name);
		setLayEggs(layEggs);
	}
}
