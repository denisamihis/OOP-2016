package models.animals;

public class Pigeon extends Bird {
	public Pigeon() {
		setNrOfLegs(2);
	}

	public Pigeon(String name, Boolean migrates, Integer avgFlightAttitude) {
		setName(name);
		setMigrates(migrates);
		setNrOfLegs(2);
		SetavgFlightAttitude(avgFlightAttitude);
	}

}
