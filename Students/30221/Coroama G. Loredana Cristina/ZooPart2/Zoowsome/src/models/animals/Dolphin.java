package models.animals;



public class Dolphin extends Aquatic {
	  public  WaterType type;
	 public  Dolphin( WaterType type)
		{
		 super(7,0.1);
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
