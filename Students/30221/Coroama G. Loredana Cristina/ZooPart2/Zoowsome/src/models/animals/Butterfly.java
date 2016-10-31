package models.animals;

public class Butterfly extends Insect {
	
	
	public  Butterfly()
		{
		super(1,0.1);
		setCanFly(true);
		setDangerous(false);
		}
	
	@Override
	public boolean kill() {
		double d=Math.random();
		if(d<dangerPerc)
			return true;
		return false;
	}
	
	

}
