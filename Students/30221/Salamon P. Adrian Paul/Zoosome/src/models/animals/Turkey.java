package models.animals;

public class Turkey extends Bird {
	public Turkey() {
		setNrOfLegs(2);
	}

	public Turkey(String name, Boolean migrates, Integer avgFlightAttitude) {
		setNrOfLegs(2);
		setName(name);
		setMigrates(migrates);
		SetavgFlightAttitude(avgFlightAttitude);
	}

}
