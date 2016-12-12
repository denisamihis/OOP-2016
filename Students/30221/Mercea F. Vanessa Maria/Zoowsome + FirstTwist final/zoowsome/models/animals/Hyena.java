package animals;

public class Hyena extends Mammal {
	public Hyena() {
		setNrOfLegs(4);
		setName("Hyena");
		setNormalBodyTemp(38);
		setPercBodyHair(80);
		}
	
	public Hyena(Integer nrOfLegs, String name, Integer normalBodyTemp, Integer percBodyHair) {
		setNrOfLegs(nrOfLegs);
		setName(name);
		setNormalBodyTemp(normalBodyTemp);
		setPercBodyHair(percBodyHair);
	}
}
