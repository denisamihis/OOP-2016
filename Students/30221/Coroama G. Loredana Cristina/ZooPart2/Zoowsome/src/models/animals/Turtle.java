package models.animals;

public class Turtle extends Reptile {
	
		public Turtle()
			{
				super(2,0.1);
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
