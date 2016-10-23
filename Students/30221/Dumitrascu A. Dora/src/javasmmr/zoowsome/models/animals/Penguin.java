package javasmmr.zoowsome.models.animals;

public class Penguin extends Bird{
	public Penguin(){
		setNrOfLegs(2);
		setName("Penguin");
		setMigrates(false);
		setFlightAltitude(0);
	}
	
	public Penguin(int nrOfLegs, String name, boolean migrates, int avgFlightAltitude){
		this.nrOfLegs=nrOfLegs;
		this.name=name;
		this.migrates=migrates;
		this.avgFlightAltitude=avgFlightAltitude;
	}
}
