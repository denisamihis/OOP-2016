package models.animals;

public abstract class reptile extends animals{
	private boolean laysEggs;
	
	public void setLaysEggs(boolean attribute){
		laysEggs = attribute;
	}
	
	public boolean getLaysEggs(){
		return laysEggs;
	}
}