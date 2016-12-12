package javasmmr.zoowsome.models.animals;

public class Ostrich extends Bird {

	public Ostrich(int legs, String name){
		this.setName(name);
		this.setNrOfLegs(legs);
	}
	
	public Ostrich(){
		this.setName("ostrich");
		this.setNrOfLegs(2);
	}
}
