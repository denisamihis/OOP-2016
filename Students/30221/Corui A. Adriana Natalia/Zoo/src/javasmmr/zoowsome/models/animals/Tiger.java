package javasmmr.zoowsome.models.animals;

public class Tiger extends Mammal{

	public Tiger(double d,double p)
	{
		super(d,p);
		super.setNrOfLegs(4);
		super.setBodyTemp(27);
		super.setPrecBodyHair(99);
		super.setName("tiger");	
	}
}
