package javasmmr.zoowsome.models.animals;

public class Butterfly extends Insect{

	public Butterfly(double d,double p)
	{
		super(d,p);
		super.setNrOfLegs(6);
		super.setDangerLvl(false);
		super.setFlyAbility(true);
		super.setName("butterfly");	
	}
}
