package javasmmr.zoowsome.models;

public abstract class Bird extends Animals {
    private Integer flightability;
    
    public void printflight(){
    	System.out.println("flight attitude is "+flightability);
    	
    }
    public void setflight(Integer flight){
    	this.flightability = flight;
    }
    
}
