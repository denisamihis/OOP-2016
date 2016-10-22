package javasmmr.zoowsome.models.animals;

public class Lion extends Mammal{
	
	public Lion(String name, int legs, float temp,float hair){
		this.setName(name);
		this.setNrOfLegs(legs);
		this.setNormalBodyTemp(temp);
		this.setPrecBodyHair(hair);
	}

	public Lion(){	
		
		this.setName("Lion");
		this.setNrOfLegs(4);
		this.setNormalBodyTemp((float) 38.33);
		this.setPrecBodyHair((float) 100);
}
}
