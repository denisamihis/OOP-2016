package javasmmr.zoowsome.models.animals;

public class Cow  extends Mammal{

	public Cow(double d,double p)
	{
		super(d,p);
		super.setNrOfLegs(4);
		super.setBodyTemp(30);
		super.setPrecBodyHair(98);
		super.setName("cow");	
	}
}
