package javasmmr.zoowsome.models;

public class Flamingo extends Bird {
	
	public Flamingo()
	{
		;
	}
	
	public Flamingo(String name,boolean answer, int altitude)
	{
		this.setNumberOfLegs(2);
		this.setName(name);
		this.setIsMigrating(answer);
		this.setAvgFlightAltitude(altitude);
	}
}