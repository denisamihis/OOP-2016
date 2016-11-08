package javasmmr.zoowsome.models.animals;

public class Monkey extends Mammal{
	public Monkey (int nrOfLegs, String name, float normalBodyTemp, float percBodyHair, double maintenanceCost, double dangerPerc){
		super(maintenanceCost, dangerPerc);
		setNrOfLegs(nrOfLegs);
		setName(name);
		setNormalBodyTemp(normalBodyTemp);
		setPercBodyHair(percBodyHair);
	}
	
	public Monkey(){
		super(6.1, 0.1);
		setNrOfLegs(2);
		setName("Monkey");
		setNormalBodyTemp(36.0f);
		setPercBodyHair(92.3f);
	}
	

}
