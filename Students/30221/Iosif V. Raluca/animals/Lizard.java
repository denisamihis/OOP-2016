package javasmmr.zoowsome.models.animals;

public class Lizard extends Reptile {

	public Lizard (int legs, String name){
		this.setName(name);
		this.setNrOfLegs(legs);
	}
	
	public Lizard(){
		this.setName("lizard");
		this.setNrOfLegs(4);
	}
}
