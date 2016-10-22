package javasmmr.zoowsome.models.animals;

public abstract class Animal {
	private int nrOfLegs;
	private String name;
	
	public int getNrOfLegs(){
		return nrOfLegs;
	}
	
	public void setNrOfLegs(int legs){
		nrOfLegs=legs;
		
	}
	public String getName(){
		return name;
	}
	public void setName(String animalName){
		name=animalName;
		
		
	}
}
