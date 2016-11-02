package javasmmr.zoowsome.models.animals;

public class Snake extends Reptile{

	public Snake(double d,double p)
	{
		super(d,p);
		super.setNrOfLegs(0);
		super.setEgg(true);
		super.setName("snake");	
	}
}
