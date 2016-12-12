package models.animals;

public class Cockroach extends Insect {
	public Cockroach(){
		super(8.0 , 0.0);
		setCanFly(true);
		setIsDangerous(false);
		setNrOfLegs(2);
		setName("Cockroach");
	}
	public Cockroach(boolean canFly , boolean isDangerous, int nrOfLegs, String name){
		super(8.0 ,0.0);
		setCanFly(canFly);
		setIsDangerous(isDangerous);
		setNrOfLegs(nrOfLegs);
		setName(name);
	}
}