package animals;

public class Kangaroo extends Mammal{
	public Kangaroo() {
		setNrOfLegs(2);
		setName("Kangaroo");
		setNormalBodyTemp(40);
		setPercBodyHair(80);
		}
	public Kangaroo(Integer nrOfLegs, String name, Integer normalBodyTemp, Integer percBodyHair) {
		setNrOfLegs(nrOfLegs);
		setName(name);
		setNormalBodyTemp(normalBodyTemp);
		setPercBodyHair(percBodyHair);
	}
}
