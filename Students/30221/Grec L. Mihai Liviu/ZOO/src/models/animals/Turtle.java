package models.animals;

public class Turtle extends Reptile{
	public Turtle(){
		super(1.8 , 0.0);
		setNrOfLegs(4);
		setName("Turtle");
		setLaysEggs(true);
	}
	public Turtle(Integer  nrOfLegs , String name , boolean laysEggs){
		super(1.8 , 0.0);
		setNrOfLegs(nrOfLegs);
		setName(name);
		setLaysEggs(laysEggs);
	} 
}
