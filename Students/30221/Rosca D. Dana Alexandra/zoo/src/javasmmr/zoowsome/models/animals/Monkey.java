package javasmmr.zoowsome.models.animals;

public class Monkey extends Mammal{
	public Monkey(){
		setNrLegs(2);
		setName("Monkey");
		setNormalBodyTemp(38.2f);
		setPercBodyHair(90.1f);
	}

	public Monkey(Integer nrOfLegs, String name,Float normalBodyTemp, Float percBodyHair){
		 setNrLegs(nrOfLegs);
		 setName(name);
		 setNormalBodyTemp(normalBodyTemp);
		 setPercBodyHair(percBodyHair);
	}
}
