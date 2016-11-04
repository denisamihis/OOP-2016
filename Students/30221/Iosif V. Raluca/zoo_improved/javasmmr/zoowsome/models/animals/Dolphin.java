package javasmmr.zoowsome.models.animals;

public class Dolphin extends Aquatic {
	
	public Dolphin (int legs, String name){
		this.setName(name);
		this.setNrOfLegs(legs);
	}
	
	public Dolphin(){
		this.setName("Dolphin");
		this.setNrOfLegs(0);
	}

}
