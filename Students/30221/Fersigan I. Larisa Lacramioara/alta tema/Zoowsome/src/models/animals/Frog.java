package models.animals;

public class Frog extends Reptile{
	public Frog(){
		super(0,0.0);
		setNrOfLegs(4);
		setName("Oaky");
		setLaysEggs(true);
	}
	@Override
	public boolean kill() {
		// TODO Auto-generated method stub
		double d=Math.random();
		if(d<dangerPerc)
			return true;
		return false;
	}
}
