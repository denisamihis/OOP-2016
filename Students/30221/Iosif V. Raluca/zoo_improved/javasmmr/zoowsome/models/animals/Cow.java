package javasmmr.zoowsome.models.animals;

public class Cow extends Mammal{
	
	public Cow( int legs, String name){
		this.setName(name);
		this.setNrOfLegs(legs);
	}
	public Cow(){
		this.setName("Cow");
		this.setNrOfLegs(4);
	}
}
