package javasmmr.zoowsome.models.animals;

public class Tiger extends Mammal {
	
	public Tiger(int number, String name){
		this.setNrOfLegs(number);
		this.setName(name);
		
	}
	
	public Tiger(){
		this.setNrOfLegs(4);
		this.setName("Tiger");
	}
	
}
