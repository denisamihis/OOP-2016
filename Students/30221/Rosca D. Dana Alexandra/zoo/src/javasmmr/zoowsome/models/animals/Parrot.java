package javasmmr.zoowsome.models.animals;

public class Parrot extends Birds{
	public Parrot(){
		 setNrLegs(2);
		 setName("Parrot");
		 setMigrates(Boolean.FALSE);
		 setAvgFlightAltitude(50);
	}
			
	public Parrot(Integer nrOfLegs, String name,Boolean migrates,Integer avgFlightAltitude){
		 setNrLegs(nrOfLegs);
		 setName(name);
		 setMigrates(migrates);
		 setAvgFlightAltitude(avgFlightAltitude);
	}
}
