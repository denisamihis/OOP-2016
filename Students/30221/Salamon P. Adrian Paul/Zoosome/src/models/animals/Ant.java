package models.animals;

public class Ant extends Insect{
	public Ant(){
		setNrOfLegs(6);
	}
	public Ant(String name, Boolean canFly, Boolean isDangerous){
		setCanFly(canFly);
		setIsDangerous(isDangerous);
		setName(name);
		setNrOfLegs(6);
	}

}
