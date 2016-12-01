package models.animals;

public class Butterfly extends Insect {
	public Butterfly(){
		super (2.0, 0.0);
		setCanFly(true);
		setIsDangerous(false);
		setNrOfLegs(0);
		setName("Butterfly");
	}
	public Butterfly(boolean canFly , boolean isDangerous, int nrOfLegs, String name){
		super (2.0 ,0.0);
		setCanFly(canFly);
		setIsDangerous(isDangerous);
		setNrOfLegs(nrOfLegs);
		setName(name);
	}
}