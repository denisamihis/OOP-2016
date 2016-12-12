package javasmmr.zoowsome.models.animals;

public class Phoenix extends Bird {

	public Phoenix (int legs, String name){
		this.setName(name);
		this.setNrOfLegs(legs);
	}
	
	public Phoenix(){
		this.setName("phoenix");
		this.setNrOfLegs(2);
	}
}
