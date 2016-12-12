package javasmmr.zoowsome.models.animals;

public class Lizard extends Reptile {
	
	public Lizard(String name, boolean egg){
		
		this.setName(name);
		this.setLayEggs(egg);
	}
	
	public Lizard(){
		
		this.setName("Lizard");
		this.setLayEggs(true);
	}
	

}
