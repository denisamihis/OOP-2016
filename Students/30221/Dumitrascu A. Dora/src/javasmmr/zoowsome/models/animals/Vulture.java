package javasmmr.zoowsome.models.animals;

public class Vulture extends Bird{
	public Vulture(){
		setNrOfLegs(2);
		setName("Vulture");
		setMigrates(false);
		setFlightAltitude(11000);
	}
	
	public Vulture(int nrOfLegs, String name, boolean migrates, int avgFlightAltitude){
		this.nrOfLegs=nrOfLegs;
		this.name=name;
		this.migrates=migrates;
		this.avgFlightAltitude=avgFlightAltitude;
	}
}
