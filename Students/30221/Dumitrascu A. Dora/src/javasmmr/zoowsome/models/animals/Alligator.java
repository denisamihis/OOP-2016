package javasmmr.zoowsome.models.animals;

public class Alligator extends Reptile{
	public Alligator(){
		setNrOfLegs(4);
		setName("Alligator");
		setLaysEggs(true);
	}
	
	public Alligator(int nrOfLegs, String name, boolean laysEggs){
		this.nrOfLegs=nrOfLegs;
		this.name=name;
		this.laysEggs=laysEggs;
	}
}
