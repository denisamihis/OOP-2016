package models.animals;

public class Stork extends Bird{

	public Stork(){
		super(1,0.2);
		setNrOfLegs(2);
		setName("Barza");
		setMigrates(true);
		setAvgFlightAltitude(145);
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
