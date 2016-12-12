package javasmmr.zoowsome.models.animals;

public class Owl extends Birds {
	public Owl(){
		 setNrLegs(2);
		 setName("Owl");
		 setMigrates(Boolean.FALSE);
		 setAvgFlightAltitude(1000);
		 }

	public Owl(Integer nrOfLegs, String name,Boolean migrates,Integer avgFlightAltitude){
		 setNrLegs(nrOfLegs);
		 setName(name);
		 setMigrates(migrates);
		 setAvgFlightAltitude(avgFlightAltitude);
		 }

}
