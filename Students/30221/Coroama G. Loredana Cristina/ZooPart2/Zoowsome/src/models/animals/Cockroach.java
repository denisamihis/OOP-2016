package models.animals;

public class Cockroach extends Insect{
	
	public  Cockroach( )
		{
		super(1,0.6);
		setCanFly(false);
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
