package javasmmr.zoowsome.models.animals;

public class Snake extends Reptile {
	
	public Snake(String name, boolean egg){
		
		this.setName(name);
		this.setLayEggs(egg);
	}
	
	public Snake(){
		
		this.setName("Snake");
		this.setLayEggs(true);
	}
	

}
