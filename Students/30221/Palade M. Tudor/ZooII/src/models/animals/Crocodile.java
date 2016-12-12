package models.animals;

public class Crocodile extends Reptile{
	public Crocodile(){
		super(5.3 , 1.0);
		setLaysEggs(true);
		setNrOfLegs(4);
		setName("Crocodile");
	}
	public Crocodile(boolean laysEggs, int nrOfLegs, String name){
		super(5.3 ,1.0);
		setLaysEggs(laysEggs);
		setNrOfLegs(nrOfLegs);
		setName(name);
	}
}