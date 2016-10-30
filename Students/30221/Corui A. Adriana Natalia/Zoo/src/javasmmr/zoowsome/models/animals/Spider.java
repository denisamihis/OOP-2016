package javasmmr.zoowsome.models.animals;

public class Spider extends Insect {

	public Spider(double d,double p)
	{
		super(d,p);
		super.setNrOfLegs(8);
		super.setDangerLvl(true);
		super.setFlyAbility(false);
		super.setName("spider");	
	}
}
