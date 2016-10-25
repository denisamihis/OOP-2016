package models.animals;

public abstract class Animal {
	private String name;
	private Integer nrOfLegs;

	public int getNrOfLegs() {
		return nrOfLegs;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setNrOfLegs(Integer nrOfLegs) {
		this.nrOfLegs = nrOfLegs;

	}
}
