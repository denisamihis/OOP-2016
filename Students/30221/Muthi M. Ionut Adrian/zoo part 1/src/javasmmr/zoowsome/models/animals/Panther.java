package javasmmr.zoowsome.models.animals;

public class Panther extends Mammal{
	
	public Panther(String name, int legs, float temp,float hair){
		this.setName(name);
		this.setNrOfLegs(legs);
		this.setNormalBodyTemp(temp);
		this.setPrecBodyHair(hair);
	}

	public Panther(){	
		
		this.setName("Black Panter");
		this.setNrOfLegs(4);
		this.setNormalBodyTemp((float) 35.5);
		this.setPrecBodyHair((float) 100);
}

}
