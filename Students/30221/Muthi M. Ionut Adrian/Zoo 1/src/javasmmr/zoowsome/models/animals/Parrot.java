package javasmmr.zoowsome.models.animals;

public class Parrot extends Bird {
	
	public Parrot (String name,boolean migrate, int altitude){
		
		this.setName(name);
		this.setAvgFligthAltitude(altitude);
		this.setMigrtaes(migrate);
	}
	
	public Parrot(){
		this.setName("Parrot");
		this.setAvgFligthAltitude(200);
		this.setMigrtaes(false);
	}

}
