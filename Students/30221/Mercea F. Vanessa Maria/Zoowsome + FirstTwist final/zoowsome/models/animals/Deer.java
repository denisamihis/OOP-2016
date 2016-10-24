package animals;

public class Deer extends Mammal{
	public Deer() {
		setNrOfLegs(4);
		setName("Deer");
		setNormalBodyTemp(40);
		setPercBodyHair(100);
		}
	
	public Deer(Integer nrOfLegs, String name, Integer normalBodyTemp, Integer percBodyHair) {
		setNrOfLegs(nrOfLegs);
		setName(name);
		setNormalBodyTemp(normalBodyTemp);
		setPercBodyHair(percBodyHair);
	}
}
