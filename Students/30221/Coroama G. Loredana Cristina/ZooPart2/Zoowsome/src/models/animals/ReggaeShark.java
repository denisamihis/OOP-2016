package models.animals;

public class ReggaeShark extends Aquatic {
	
	
 public  WaterType type;
	
	 
	 public  ReggaeShark( WaterType type)
		{
		 super(2,0.9);
			
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
