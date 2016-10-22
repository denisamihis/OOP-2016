package javasmmr.zoowsome.models.animals;

public class Tucan extends Bird {
	
	public Tucan(String name,boolean migrate, int altitude){
		
		this.setName(name);
		this.setAvgFligthAltitude(altitude);
		this.setMigrtaes(migrate);
	}
	
	public Tucan(){
		this.setName("Tucan");
		this.setAvgFligthAltitude(300);
		this.setMigrtaes(false);
	}
	
	

}
