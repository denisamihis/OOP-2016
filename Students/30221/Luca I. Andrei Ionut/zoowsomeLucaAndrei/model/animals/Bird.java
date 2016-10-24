package animals;

public abstract class Bird extends Animal {
	private Boolean migrates;
	private Integer avgFlightAltitude;

	public Boolean getMigrates() {
		return migrates;
	}

	public void setMigrates(Boolean migrate) {
		migrates = migrate;
	}

	public Integer getAvgFlightAltitude() {
		return avgFlightAltitude;
	}

	public void setAvgFlightAltitude(Integer flightAltitude) {
		avgFlightAltitude = flightAltitude;
	}
}
