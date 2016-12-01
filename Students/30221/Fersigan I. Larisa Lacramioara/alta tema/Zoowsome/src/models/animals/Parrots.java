package models.animals;

public class Parrots extends Bird {

	public Parrots(){
		super(2,0.2);
		setNrOfLegs(2);
		setName("Paco");
		setMigrates(false);
		setAvgFlightAltitude(23);
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
