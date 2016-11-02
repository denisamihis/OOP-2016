package javasmmr.zoowsome.models.animals;

public class Duck extends Bird{

	public Duck(double d,double p)
	{
		super(d,p);
		super.setNrOfLegs(2);
		super.setAvgFlyAltitude(20);
		super.setMigration(false);
		super.setName("duck");	
	}
}
