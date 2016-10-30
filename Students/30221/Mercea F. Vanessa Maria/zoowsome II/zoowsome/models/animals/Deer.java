package animals;

public class Deer extends Mammal{
	public Deer() {
		super(2.0,0.0001);
		setNrOfLegs(4);
		setName("Deer");
		setNormalBodyTemp(40);
		setPercBodyHair(100);
		}
	
	public Deer(Integer nrOfLegs, String name, Double maintenanceCost, Double dangerPerc, Integer normalBodyTemp, Integer percBodyHair) {
		super(maintenanceCost,dangerPerc);
		setNrOfLegs(nrOfLegs);
		setName(name);
		setNormalBodyTemp(normalBodyTemp);
		setPercBodyHair(percBodyHair);
	}
}
