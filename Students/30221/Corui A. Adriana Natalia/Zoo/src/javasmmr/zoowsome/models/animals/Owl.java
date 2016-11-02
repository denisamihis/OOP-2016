package javasmmr.zoowsome.models.animals;

public class Owl extends Bird{

	public Owl(double d,double p)
	{
		super(d,p);
		super.setNrOfLegs(2);
		super.setAvgFlyAltitude(10);
		super.setMigration(true);
		super.setName("owl");	
	}
}
