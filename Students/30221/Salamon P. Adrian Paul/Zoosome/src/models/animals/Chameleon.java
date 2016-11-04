package models.animals;

public class Chameleon extends Reptile {
	public Chameleon() {
		setNrOfLegs(4);
		setLaysEggs(true);
	}

	public Chameleon(String name) {
		setNrOfLegs(4);
		setLaysEggs(true);
		setName(name);
	}
}
