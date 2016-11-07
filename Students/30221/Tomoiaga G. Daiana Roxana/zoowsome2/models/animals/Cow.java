package javasmmr.zoowsome.models.animals;

public class Cow extends Mammal {
	public Cow (int nrOfLegs, String name, float normalBodyTemp, float percBodyHair, double maintenanceCost, double dangerPerc){
		super(maintenanceCost, dangerPerc);
		setNrOfLegs(nrOfLegs);
		setName(name);
		setNormalBodyTemp(normalBodyTemp);
		setPercBodyHair(percBodyHair);
	}
	
	public Cow(){
		super(2.1, 0.1);
		setNrOfLegs(4);
		setName("Cow");
		setNormalBodyTemp(39.2f);
		setPercBodyHair(80.5f);
	}
	
}
