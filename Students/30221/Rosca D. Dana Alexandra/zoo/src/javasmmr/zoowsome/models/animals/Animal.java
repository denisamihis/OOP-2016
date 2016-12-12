package javasmmr.zoowsome.models.animals;

public abstract class Animal {
	private Integer nrLegs;
	private String name;
			public Integer getNrLegs(){
			return nrLegs;
			}
		 	
		 	public void setNrLegs(Integer nrOfLegs){
		 		this.nrLegs=nrOfLegs;
		 	}
		 	
		 	public String getName(){
		 		return name;
		 	}
		 	
		 	public void setName(String name){
		 		this.name=name;
		 	}
		 
}
