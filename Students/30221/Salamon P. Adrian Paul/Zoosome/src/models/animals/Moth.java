package models.animals;

public class Moth extends Insect {
	public Moth(){
		setNrOfLegs(6);
	}
	public Moth(String name, Boolean canFly, Boolean isDangerous){
		setName(name);
		setCanFly(canFly);
		setIsDangerous(isDangerous);
		setNrOfLegs(6);
	}

}