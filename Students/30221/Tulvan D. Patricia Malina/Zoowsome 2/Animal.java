package javasmmr.zoowsome.models.animals;
import java.util.Random;

public abstract class Animal implements Killer{
	private Integer nrOfLegs;
	private String name;
	private final Double maintenanceCost; //holds how many hours per week an animal requires
	private final Double dangerPerc;
	private Boolean takenCareOf;
	
	public Animal(Double maintenanceCost, Double dangerPerc){
		this.maintenanceCost=maintenanceCost;
		this.dangerPerc=dangerPerc+ getPredisposition();
		this.takenCareOf=false;
	}
	
	public Integer getNrOfLegs(){
		return nrOfLegs;
	}
	
	public void setNrOfLegs(Integer nrOfLegs){
		this.nrOfLegs=nrOfLegs;
	}
	
	public String getName(){
		return name;
	}
	
	public void setName(String name){
		this.name=name;
	}
	
	public void setTakenCareOf(Boolean takenCareOf){
		this.takenCareOf=takenCareOf;
	}
	
	public Boolean getTakenCareOf(){
		return takenCareOf;
	}
	
	public Double getMaintenanceCost(){
		return maintenanceCost;
	}
	
	public Double getDangerPerc(){
		return dangerPerc;
	}
	
	public boolean kill(){
		Random random= new Random();
		Double randomDangerPerc= random.nextDouble();
		if(randomDangerPerc < dangerPerc)	
			return true; 
		return false;
	}

	public double getPredisposition(){
		return 0.0;
	}
	
}
