package models.animals;

public class Fly extends Insect {
	public Fly(){
		setNrOfLegs(6);
	}
	public Fly(String name, Boolean canFly, Boolean isDangerous){
		setName(name);
		setCanFly(canFly);
		setIsDangerous(isDangerous);
		setNrOfLegs(6);
	}

}
