package javasmmr.zoowsome.models.animals;

public class Tuna extends Aquatic {
	
	public Tuna(int legs, String name){
		this.setName(name);
		this.setNrOfLegs(legs);
	}
	
	public Tuna(){
		this.setName("Tuna");
		this.setNrOfLegs(0);
	}
}
