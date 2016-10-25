package javasmmr.zoowsome.models.animals;

public class Spider extends Insect {
	public Spider(){
		setNrOfLegs(8);
		setName("Spider");
		setCanFly(Boolean.FALSE);
		setIsDangerous(Boolean.TRUE);
	}
	
	public Spider(Integer nrOfLegs, String name, Boolean canFly, Boolean isDangerous){
		setNrOfLegs(nrOfLegs);
		setName(name);
		setCanFly(canFly);
		setIsDangerous(isDangerous);
	}
}
