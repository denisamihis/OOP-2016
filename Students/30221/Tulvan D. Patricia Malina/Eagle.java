package javasmmr.zoowsome.models.animals;

public class Eagle extends Bird{
	public Eagle(){
		setNrOfLegs(2);
		setName("Eagle");
		setMigrates(Boolean.FALSE);
		setAvgFlightAltitude(10000);
	}
	
	public Eagle(Integer nrOfLegs, String name,Boolean migrates,Integer avgFlightAltitude){
		setNrOfLegs(nrOfLegs);
		setName(name);
		setMigrates(migrates);
		setAvgFlightAltitude(avgFlightAltitude);
	}
}
