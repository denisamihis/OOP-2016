package models.animals;

public class Eagle extends Bird{


		public Eagle( )
		{
			super(4,0.1);
			
			setNrOfLegs(4);
			setAvgFlightAltitude(3);
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