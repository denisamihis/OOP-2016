package models.animals;

public abstract class animals{
	private int nrOfLegs;
	private String name;
	
	public void setNrOfLegs(int nr){
		nrOfLegs = nr;
	}
	public void setName(String name){
		this.name = name;
	}
	
	public int getNrOfLegs(){
		return nrOfLegs;
	}
	public String getName(){
		return name;
	}
}