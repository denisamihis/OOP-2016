package javasmmr.zoowsome.models.animals;

public class Turtle extends Reptile{

	public Turtle(double d,double p)
	{
		super(d,p);
		super.setNrOfLegs(4);
		super.setEgg(true);
		super.setName("turtle");	
	}
}
