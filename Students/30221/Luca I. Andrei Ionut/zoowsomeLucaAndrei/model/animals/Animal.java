package animals;

public abstract class Animal {
	private int nrOfLegs;
	private String name;

	public Integer getNrOfLegs() {
		return nrOfLegs;
	}

	public void setNrOfLegs(int number) {
		nrOfLegs = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String givenName) {
		name = givenName;
	}
}