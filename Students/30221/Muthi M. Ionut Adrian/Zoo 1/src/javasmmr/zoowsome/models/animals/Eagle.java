package javasmmr.zoowsome.models.animals;

public class Eagle extends Bird {
	
	public Eagle(String name,boolean migrate, int altitude){
	
		this.setName(name);
		this.setAvgFligthAltitude(altitude);
		this.setMigrtaes(migrate);
	}
	
	public Eagle(){
		this.setName("Eagle");
		this.setAvgFligthAltitude(12000);
		this.setMigrtaes(true);
	}

	

}
