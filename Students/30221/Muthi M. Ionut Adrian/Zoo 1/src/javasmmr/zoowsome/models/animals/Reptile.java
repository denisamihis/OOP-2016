package javasmmr.zoowsome.models.animals;

public abstract class Reptile extends Animal {
	
     private boolean layEggs;
	

	
	public boolean getLayEggs(){		
		return layEggs;	
	}
	
	public void setLayEggs(boolean egg){
		layEggs=egg;
	}

}
