package models.animals;

public abstract class Bird extends Animal {
	Boolean migrates;
	Integer avgFlightAttitude;

	public Boolean getMigrates() {
		return migrates;
	}

	public Integer getAvgFlightAttitude() {
		return avgFlightAttitude;
	}

	public void setMigrates(Boolean migrates) {
		this.migrates = migrates;
	}

	public void SetavgFlightAttitude(Integer avgFlightAttitude) {
		this.avgFlightAttitude = avgFlightAttitude;
	}
}
