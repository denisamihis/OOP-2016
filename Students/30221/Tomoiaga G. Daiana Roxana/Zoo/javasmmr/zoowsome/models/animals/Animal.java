package javasmmr.zoowsome.models.animals;

public abstract class Animal {
	
		protected int nrOfLegs;
		protected String name;
		
		public int getNrOfLegs () {
			return nrOfLegs;
		}
		
		public void setNrOfLegs (int nrOfLegs) {
			this.nrOfLegs = nrOfLegs;
		}
		
		public String getName () {
			return name;
		}
		
		public void setName (String name) {
			this.name=name;
		}
		

}
