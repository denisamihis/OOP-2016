package javasmmr.zoowsome.models.animals;

public class Parrot extends Bird{
	public Parrot(){
		super(0.2,0);
		setNrOfLegs(2);
		setName("Parrot");
		setMigrates(false);
		setFlightAltitude(30);
	}
	
	public Parrot(int nrOfLegs, String name, boolean migrates, int avgFlightAltitude,double maintenanceCost,double dangerPerc){
		super(maintenanceCost,dangerPerc);
		this.nrOfLegs=nrOfLegs;
		this.name=name;
		this.migrates=migrates;
		this.avgFlightAltitude=avgFlightAltitude;
	}
}
