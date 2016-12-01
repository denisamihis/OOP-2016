package models.animals;

public class Lizzard extends Reptile{
	public Lizzard(){
		super(2.3 ,0.5);
		setLaysEggs(true);
		setNrOfLegs(4);
		setName("Lizzard");
	}
	public Lizzard(boolean laysEggs, int nrOfLegs, String name){
		super(2.3 ,0.5);
		setLaysEggs(laysEggs);
		setNrOfLegs(nrOfLegs);
		setName(name);
	}
}