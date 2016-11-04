package javasmmr.zoowsome.models.animals;

public class Turtle extends Reptile{
	public Turtle(){
		setNrOfLegs(4);
		setName("Turtle");
		setLaysEggs(true);
	}
	
	public Turtle(int nrOfLegs, String name, boolean laysEggs){
		this.nrOfLegs=nrOfLegs;
		this.name=name;
		this.laysEggs=laysEggs;
	}
}
