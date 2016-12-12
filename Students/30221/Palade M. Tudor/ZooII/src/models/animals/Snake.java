package models.animals;

public class Snake extends Reptile{
	public Snake(){
		super(4.3 ,0.7);
		setLaysEggs(true);
		setNrOfLegs(0);
		setName("Snake");
	}
	public Snake(boolean laysEggs, int nrOfLegs, String name){
		super(4.3 , 0.7);
		setLaysEggs(laysEggs);
		setNrOfLegs(nrOfLegs);
		setName(name);
	}
}