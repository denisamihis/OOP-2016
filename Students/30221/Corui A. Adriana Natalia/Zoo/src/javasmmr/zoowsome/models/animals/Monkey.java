package javasmmr.zoowsome.models.animals;

public class Monkey  extends Mammal{

	public Monkey(double d,double p)
	{
		super(d,p);
		super.setNrOfLegs(4);
		super.setBodyTemp(35);
		super.setPrecBodyHair(80);
		super.setName("monkey");	
	}
}
