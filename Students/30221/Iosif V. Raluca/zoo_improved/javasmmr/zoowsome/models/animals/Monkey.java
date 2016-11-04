package javasmmr.zoowsome.models.animals;

public class Monkey extends Mammal{
		
	public Monkey(int legs, String name){
		this.setNrOfLegs(legs);
		this.setName(name);
		
	}
	public Monkey(){
		this.setNrOfLegs(4);
		this.setName("Monkey");
	}
}
