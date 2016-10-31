package models.animals;

public class Snake extends Reptile {
	
	 public boolean laysEggs;
		public Snake()
			{
				super(4,0.9);
				setLaysEggs(true);
			}
		
		@Override
		public boolean kill() {
			double d=Math.random();
			if(d<dangerPerc)
				return true;
			return false;
		}
		


}
