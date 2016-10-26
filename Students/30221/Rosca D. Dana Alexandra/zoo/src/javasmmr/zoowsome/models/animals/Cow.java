package javasmmr.zoowsome.models.animals;

public class Cow extends Mammal{
	public Cow(){
			setNrLegs(4);
		 	setName("Cow");
		 	setNormalBodyTemp(38.0f);
		 	setPercBodyHair(80.5f);
		 	}
		 	
		 	public Cow(Integer nrOfLegs, String name, Float normalBodyTemp, Float percBodyHair ){
		 		setNrLegs(nrOfLegs);
		 		setName(name);
		 		setNormalBodyTemp(normalBodyTemp);
		 		setPercBodyHair(percBodyHair);
		 	}
}
