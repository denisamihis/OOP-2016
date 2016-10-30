package models.animals;

public class Butterfly extends Insect{
	public Butterfly(){
		super(2.1 , 0.0);
		setNrOfLegs(6);
		setName("Butterfly");
		setCanFly(true);
		setIsDangerous(false);
		
	}
	public Butterfly(Integer nrOfLegs , String name , boolean canFly , boolean isDangerous){
		super(1.0 , 0.0);
		setNrOfLegs(nrOfLegs);
		setName(name);
		setCanFly(canFly);
		setIsDangerous(isDangerous);
		
	}
}
