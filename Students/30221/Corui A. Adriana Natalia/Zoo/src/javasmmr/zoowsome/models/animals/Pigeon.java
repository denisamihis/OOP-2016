package javasmmr.zoowsome.models.animals;

public class Pigeon extends Bird{

	public Pigeon(double d,double p)
	{
		super(d,p);
		super.setNrOfLegs(6);
		super.setAvgFlyAltitude(5);
		super.setMigration(false);
		super.setName("pigeon");	
	}
}
