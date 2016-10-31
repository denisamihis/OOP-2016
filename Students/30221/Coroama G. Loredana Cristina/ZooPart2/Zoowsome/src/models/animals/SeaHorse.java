package models.animals;



public class SeaHorse extends Aquatic {
	 
	  public  WaterType type;
	 public  SeaHorse( WaterType type)
		{
		 super(2,0.0);
		 this.type=type;
		}
	 
	
	@Override
	public boolean kill() {
		double d=Math.random();
		if(d<dangerPerc)
			return true;
		return false;
	}
	
}
