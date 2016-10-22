package javasmmr.zoowsome.models.animals;

public class Tiger extends Mammal{
	
	public Tiger(String name, int legs, float temp,float hair){
		this.setName(name);
		this.setNrOfLegs(legs);
		this.setNormalBodyTemp(temp);
		this.setPrecBodyHair(hair);
	}

	public Tiger(){	
		
		this.setName("Tiger");
		this.setNrOfLegs(4);
		this.setNormalBodyTemp((float) 37.5);
		this.setPrecBodyHair((float) 100);
}

}
