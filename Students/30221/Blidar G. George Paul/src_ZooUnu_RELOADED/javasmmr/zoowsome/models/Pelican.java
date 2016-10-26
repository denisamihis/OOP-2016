package javasmmr.zoowsome.models;

public class Pelican extends Bird {
	
	public Pelican()
	{
		this("PELICAN",true,10);
	}
	
	public Pelican(String name, boolean answer, int altitude)
	{
		this.setNumberOfLegs(2);
		this.setName(name);
		this.setIsMigrating(answer);
		this.setAvgFlightAltitude(altitude);
	}
}