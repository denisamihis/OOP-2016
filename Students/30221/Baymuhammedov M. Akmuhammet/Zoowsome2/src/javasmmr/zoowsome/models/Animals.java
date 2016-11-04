package javasmmr.zoowsome.models;
import java.util.Random;
import java.lang.*;

public abstract class Animals implements Killer{
	private int nrlegs;
	private String name;
	private Boolean Takencareof;
	public final double maintenancecost;
	public final double Dangerperc;
	
	public Animals(double maintenance, double Danger){
		this.maintenancecost=maintenance;
		this.Dangerperc=Danger;
	}
		
	public void getNrlegs(){
		System.out.println("Has number of legs: "+nrlegs);
	}
	
	public void setnrlegs(int nrlegs){
		this.nrlegs=nrlegs;
	}
	
	public String getName(){
		System.out.println("Name: "+name);
		return name;
	}
	
	public void setname(String name){
		this.name=name;
	}
	
	public double getmaintenance(){
		return maintenancecost;
	}
	
	public double getDangerperc(){
		return Dangerperc;
	}
	
	public boolean getTakencareof(){
		return Takencareof;
	}
	
	public void setTakencareof(boolean takencare){
		this.Takencareof=takencare;
	}
	
	public boolean kill(){
		Random rand = new Random();
		double r = rand.nextDouble();
		if(r < Dangerperc)
			return true;
			else
			 return false;
	}
}

