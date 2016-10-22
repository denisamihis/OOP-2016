package models.animals;

public class Cockroach extends Insect{
	public Cockroach(){
		setNrOfLegs(6);
		setName("Cockroach");
		setCanFly(false);
		setIsDangerous(false);
	}
	public Cockroach(int nrOfLegs , String name , boolean canFly , boolean isDangerous){
		setNrOfLegs(nrOfLegs);
		setName(name);
		setCanFly(canFly);
		setIsDangerous(isDangerous);
	}
}
