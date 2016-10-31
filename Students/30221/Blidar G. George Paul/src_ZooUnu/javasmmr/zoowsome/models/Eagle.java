package javasmmr.zoowsome.models;

public class Eagle extends Bird {
	
	public Eagle()
	{
		;
	}
	
	public Eagle(String name, boolean answer, int altitude)
	{
		this.setNumberOfLegs(2);
		this.setName(name);
		this.setIsMigrating(answer);
		this.setAvgFlightAltitude(altitude);
	}
}