package javasmmr.zoowsome.models.animals;

public class Crocodile extends Reptile{

	public Crocodile(double d,double p)
	{
		super(d,p);
		super.setNrOfLegs(4);
		super.setEgg(true);
		super.setName("crocodile");	
	}
}
