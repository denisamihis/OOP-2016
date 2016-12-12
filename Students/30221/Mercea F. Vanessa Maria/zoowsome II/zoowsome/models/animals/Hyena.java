package animals;

public class Hyena extends Mammal {
	public Hyena() {
		super(3.0,0.0001);
		setNrOfLegs(4);
		setName("Hyena");
		setNormalBodyTemp(38);
		setPercBodyHair(80);
		}
	
	public Hyena(Integer nrOfLegs, String name, Double maintenanceCost, Double dangerPerc, Integer normalBodyTemp, Integer percBodyHair) {
		super(maintenanceCost,dangerPerc);
		setNrOfLegs(nrOfLegs);
		setName(name);
		setNormalBodyTemp(normalBodyTemp);
		setPercBodyHair(percBodyHair);
	}
}
