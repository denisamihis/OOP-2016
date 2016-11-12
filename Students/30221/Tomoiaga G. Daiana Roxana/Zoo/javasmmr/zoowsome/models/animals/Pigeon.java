package javasmmr.zoowsome.models.animals;

public class Pigeon extends Bird {
	public Pigeon (boolean migrates, int avgFlightAltitude){
		this.migrates=migrates;
		this.avgFlightAltitude=avgFlightAltitude;
	}
	
	public Pigeon (){
		nrOfLegs=2;
		name="Pigeon";
	}

}
