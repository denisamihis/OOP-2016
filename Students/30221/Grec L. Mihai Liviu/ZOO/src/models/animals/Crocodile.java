package models.animals;

public class Crocodile  extends Reptile{
	public Crocodile(){
		setNrOfLegs(4);
		setName("Crocodile");
		setLaysEggs(true);
	}
	public Crocodile(int nrOfLegs , String name , boolean laysEggs){
		setNrOfLegs(nrOfLegs);
		setName(name);
		setLaysEggs(laysEggs);
	}
}
