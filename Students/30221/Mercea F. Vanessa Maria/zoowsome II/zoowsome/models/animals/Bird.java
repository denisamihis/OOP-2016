package animals;

public abstract class Bird extends Animal {
	public Bird(Double maintenanceCost, Double dangerPerc) {
		super(maintenanceCost, dangerPerc);
	}

	private boolean migrates;
	private Integer avgFlightAltitude;

	public boolean getMigrates() {
		return migrates;
	}

	public void setMigrates(boolean migrates) {
		this.migrates = migrates;
	}

	public Integer getAvgFlightAltitude() {
		return avgFlightAltitude;
	}

	public void setAvgFlightAltitude(Integer avgFlightAltitude) {
		this.avgFlightAltitude = avgFlightAltitude;
	}

}
