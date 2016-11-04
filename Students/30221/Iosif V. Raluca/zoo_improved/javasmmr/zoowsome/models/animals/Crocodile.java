package javasmmr.zoowsome.models.animals;

public class Crocodile  extends Reptile{

	public Crocodile(int legs, String name){
		this.setName(name);
		this.setNrOfLegs(legs);
	}
	
	public Crocodile(){
		this.setName("crocodile");
		this.setNrOfLegs(4);
	}
}
