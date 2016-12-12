package javasmmr.zoowsome.models.animals;

public class Vulture extends Bird {
	public Vulture (boolean migrates, int avgFlightAltitude){
		this.migrates=migrates;
		this.avgFlightAltitude=avgFlightAltitude;
	}
	public Vulture(){
		nrOfLegs=2;
		name="Vulture";
	}

}
