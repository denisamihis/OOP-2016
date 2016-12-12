package javasmmr.zoowsome.models.animals;

public class Colibri extends Bird {
	public Colibri (boolean migrates, int avgFlightAltitude){
		this.migrates=migrates;
		this.avgFlightAltitude=avgFlightAltitude;
	}
	
	public Colibri (){
		nrOfLegs=2;
		name="Colibri";
	}

}
