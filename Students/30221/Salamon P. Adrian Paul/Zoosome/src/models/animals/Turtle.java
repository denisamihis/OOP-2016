package models.animals;

public class Turtle extends Reptile {
	public Turtle() {
		setLaysEggs(true);
		setNrOfLegs(4);
	}

	public Turtle(String name) {
		setLaysEggs(true);
		setNrOfLegs(4);
		setName(name);
	}

}
