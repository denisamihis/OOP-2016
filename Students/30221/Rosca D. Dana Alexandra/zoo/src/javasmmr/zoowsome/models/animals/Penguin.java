package javasmmr.zoowsome.models.animals;

public class Penguin extends Birds {
	public Penguin(){
		 setNrLegs(2);
		 setName("Penguin");
		 setMigrates(Boolean.FALSE);
		 setAvgFlightAltitude(0);
	}

public Penguin(Integer nrOfLegs, String name,Boolean migrates,Integer avgFlightAltitude){
		 setNrLegs(nrOfLegs);
		 setName(name);
		 setMigrates(migrates);
		 setAvgFlightAltitude(avgFlightAltitude);
}
}
