package javasmmr.zoowsome.models.animals;

abstract class Reptile extends Animals{
	protected boolean laysEggs;
	
	public boolean getLaysEggs(){
		return laysEggs;
	}
	
	public void setLaysEggs(boolean laysEggs){
		this.laysEggs=laysEggs;
	}
}
