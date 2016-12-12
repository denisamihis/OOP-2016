package models.animals;

public class Spider extends Insect {
	public Spider(){
		super(5.3 , 0.3);
		setCanFly(false);
		setIsDangerous(false);
		setNrOfLegs(8);
		setName("Spider");
	}
	public Spider(boolean canFly , boolean isDangerous, int nrOfLegs, String name){
		super(5.3 , 0.3);
		setCanFly(canFly);
		setIsDangerous(isDangerous);
		setNrOfLegs(nrOfLegs);
		setName(name);
	}
}