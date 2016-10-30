package javasmmr.zoowsome.models.animals;

public class Penguin extends Bird{
	public Penguin(){
		super(4.5,0.1);
		setNrOfLegs(2);
		setName("Penguin");
		setMigrates(false);
		setFlightAltitude(0);
	}
	
	public Penguin(int nrOfLegs, String name, boolean migrates, int avgFlightAltitude,double maintenanceCost,double dangerPerc){
		super(maintenanceCost,dangerPerc);
		this.nrOfLegs=nrOfLegs;
		this.name=name;
		this.migrates=migrates;
		this.avgFlightAltitude=avgFlightAltitude;
	}
}
