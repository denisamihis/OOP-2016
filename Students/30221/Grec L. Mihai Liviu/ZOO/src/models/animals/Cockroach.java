package models.animals;

public class Cockroach extends Insect{
	public Cockroach(){
		super(1.2 , 0.1);
		setNrOfLegs(6);
		setName("Cockroach");
		setCanFly(false);
		setIsDangerous(false);
	}
	public Cockroach(Integer nrOfLegs , String name , boolean canFly , boolean isDangerous){
		super(0.7 , 0.1);
		setNrOfLegs(nrOfLegs);
		setName(name);
		setCanFly(canFly);
		setIsDangerous(isDangerous);
	}
}
