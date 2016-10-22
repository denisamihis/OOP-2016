package models.animals;

public class Turtle extends Reptile{
	public Turtle(){
		setNrOfLegs(4);
		setName("Turtle");
		setLaysEggs(true);
	}
	public Turtle(int nrOfLegs , String name , boolean laysEggs){
		setNrOfLegs(nrOfLegs);
		setName(name);
		setLaysEggs(laysEggs);
	} 
}
