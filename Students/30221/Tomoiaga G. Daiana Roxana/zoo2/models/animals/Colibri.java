package javasmmr.zoowsome.models.animals;

public class Colibri extends Bird {
	public Colibri (int nrOfLegs, String name, boolean migrates, int avgFlightAltitude, double maintenanceCost, double dangerPerc){
		super(maintenanceCost, dangerPerc);
		setNrOfLegs(nrOfLegs);
		setName(name);
		setMigrates(migrates);
		setAvgFlightAltitude(avgFlightAltitude);
	}
	public Colibri (){
		super(2.9, 0.0);
		setNrOfLegs(2);
		setName("Colibri");
		setMigrates(false);
		setAvgFlightAltitude(15);
	}
	

}
