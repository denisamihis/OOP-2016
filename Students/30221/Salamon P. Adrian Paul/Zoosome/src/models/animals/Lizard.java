package models.animals;

public class Lizard extends Reptile {
	public Lizard() {
		setNrOfLegs(4);
		setLaysEggs(true);
	}

	public Lizard(String name) {
		setNrOfLegs(4);
		setLaysEggs(true);
		setName(name);

	}

}
