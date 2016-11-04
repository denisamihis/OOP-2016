package models.animals;

public class Hen extends Bird {
	public Hen() {
		setNrOfLegs(2);
		SetavgFlightAttitude(1);
	}

	public Hen(String name, Boolean migrates, Integer avgFlightAttitude) {
		setMigrates(migrates);
		setName(name);
		setNrOfLegs(2);
		SetavgFlightAttitude(avgFlightAttitude);

	}
}
