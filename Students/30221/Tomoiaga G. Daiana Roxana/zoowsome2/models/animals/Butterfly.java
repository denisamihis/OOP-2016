package javasmmr.zoowsome.models.animals;

public class Butterfly extends Insect {

	public Butterfly (boolean canFly, boolean isDangerous, String name, int nrOfLegs, double maintenanceCost, double dangerPerc){
		super(maintenanceCost, dangerPerc);
		setNrOfLegs(nrOfLegs);
		setName(name);
		setCanFly(canFly);
		setIsDangerous(isDangerous);
	}
	
	
	public Butterfly (){
		super(0.5,0.0);
		setNrOfLegs(6);
		setName("Butterfly");
		setCanFly(true);
		setIsDangerous(false);
			
	}


	@Override
	public boolean kill() {
		// TODO Auto-generated method stub
		return false;
	}

}
