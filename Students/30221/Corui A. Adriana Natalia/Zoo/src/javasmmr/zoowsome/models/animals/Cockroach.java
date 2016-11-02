package javasmmr.zoowsome.models.animals;

public class Cockroach extends Insect{

	public Cockroach(double d,double p)
	{
		super(d,p);
		super.setNrOfLegs(8);
		super.setDangerLvl(true);
		super.setFlyAbility(false);
		super.setName("cockroah");	
	}
}
