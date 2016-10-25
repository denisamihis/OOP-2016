package javasmmr.zoowsome.models.animals;

public abstract class Reptile extends Animal {
	private Boolean layEggs;
	
	public Boolean getLayEggs(){
		return layEggs;
	}
	
	public void setLayEggs(Boolean layEggs){
		this.layEggs=layEggs;
	}
}
