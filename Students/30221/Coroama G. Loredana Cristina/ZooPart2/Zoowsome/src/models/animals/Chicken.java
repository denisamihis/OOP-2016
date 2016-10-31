package models.animals;

public class Chicken extends Bird {
	

		public Chicken( )
		{
			super(2,0.1);
			setNrOfLegs(4);
			setAvgFlightAltitude(0);
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
