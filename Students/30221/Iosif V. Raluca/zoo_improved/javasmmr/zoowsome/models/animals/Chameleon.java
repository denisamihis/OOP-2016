package javasmmr.zoowsome.models.animals;

public class Chameleon extends Reptile {
	
	public Chameleon (int legs, String name){
		this.setName(name);
		this.setNrOfLegs(legs);
	}

	public Chameleon(){
		this.setName("chameleon");
		this.setNrOfLegs(4);
	}
}
