package models.animals;

public class Pinguin extends Bird {
	
	public Pinguin(){
		
		super(5,0.2);
			setNrOfLegs(2);
			setName("Pingu");
			setMigrates(false);
			setAvgFlightAltitude(43);
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
