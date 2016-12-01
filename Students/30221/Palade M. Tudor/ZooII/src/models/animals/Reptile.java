package models.animals;

abstract class Reptile extends Animal{
	boolean laysEggs;
	
	protected Reptile(Double maintenanceCost , Double dangerPerc){
		super(maintenanceCost,dangerPerc);
	}
	
	public void setLaysEggs(boolean laysEggs){
		this.laysEggs = laysEggs;
	}
	
	public boolean getLaysEggs (){
		return laysEggs;
	}
}