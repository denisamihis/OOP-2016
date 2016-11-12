package javasmmr.zoowsome.models;

public abstract class Aquatic extends Animals {
    private Boolean dangerous;
    private int swimdepth;
    
    public Aquatic(double maintenance, double danger){
    	super(maintenance, danger);
    }
    
    public void dangerous(){
    	System.out.println("Dangerous: "+dangerous);
    }
    
    public void setdangerous(Boolean danger){
    	this.dangerous=danger;
    }
    
    public void swimdepth(){
    	System.out.println("Swim depth: "+swimdepth);
    }
    
    public void setswimdepth(int depth){
    	this.swimdepth=depth;
    }
}
