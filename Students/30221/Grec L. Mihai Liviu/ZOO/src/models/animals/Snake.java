package models.animals;

public class Snake extends Reptile{
	public Snake(){
		setNrOfLegs(0);
		setName("Snake");
		setLaysEggs(true);
	}
	public Snake(int nrOfLegs , String name , boolean laysEggs){
		setNrOfLegs(nrOfLegs);
		setName(name);
		setLaysEggs(laysEggs);
	}
}
