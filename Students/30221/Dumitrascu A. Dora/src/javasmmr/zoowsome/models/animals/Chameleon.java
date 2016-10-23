package javasmmr.zoowsome.models.animals;

public class Chameleon extends Reptile{
	public Chameleon(){
		setNrOfLegs(4);
		setName("Chameleon");
		setLaysEggs(true);
	}
	
	public Chameleon(int nrOfLegs, String name, boolean laysEggs){
		this.nrOfLegs=nrOfLegs;
		this.name=name;
		this.laysEggs=laysEggs;
	}
}
