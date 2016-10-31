package models.animals;

public class Spider extends Insect {
	
	public  Spider()
		{
		super(1,0.8);
		setCanFly(false);
		setDangerous(true);
			
		}
	
	@Override
	public boolean kill() {
		double d=Math.random();
		if(d<dangerPerc)
			return true;
		return false;
	}
	
}
