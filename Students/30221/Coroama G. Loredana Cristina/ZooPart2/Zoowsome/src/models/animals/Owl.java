package models.animals;

public class Owl extends Bird{



		public Owl( )
		{
			super(2,0.1);
			setNrOfLegs(4);
			setAvgFlightAltitude(33);
			setMigrates(false);
			
		}
		
		@Override
		public boolean kill() {
			double d=Math.random();
			if(d<dangerPerc)
				return true;
			return false;
		}
	
}
