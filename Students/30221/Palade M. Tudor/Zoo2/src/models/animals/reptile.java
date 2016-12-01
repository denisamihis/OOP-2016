package models.animals;

public abstract class reptile extends animals{
	private boolean laysEggs;
	
	protected reptile(Double maintenanceCost, Double dangerPerc){
		super(maintenanceCost,dangerPerc);
	}
	
	public void setLaysEggs(boolean attribute){
		laysEggs = attribute;
	}
	
	public boolean getLaysEggs(){
		return laysEggs;
	}
}