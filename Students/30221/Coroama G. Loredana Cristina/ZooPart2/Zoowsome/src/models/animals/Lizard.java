package models.animals;

public class Lizard extends Reptile {
	

	public Lizard( )
		{
			super(5,0.3);
			setLaysEggs(true);
		}
	
	@Override
	public boolean kill() {
		double d=Math.random();
		if(d<dangerPerc)
			return true;
		return false;
	}
	
}
