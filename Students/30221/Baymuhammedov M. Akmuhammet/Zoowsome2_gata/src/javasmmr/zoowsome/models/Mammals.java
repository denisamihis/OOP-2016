package javasmmr.zoowsome.models;

public abstract class Mammals extends Animals{
	protected int bodytemp;
	protected float furr;
	
	public Mammals(double maintenance, double danger){
		super(maintenance, danger);
	}
	
	public void getbodytemp(){
		System.out.println("Has a body temperature of: "+bodytemp);;
	}
	
	public void setbodytemp(int bodytemp){
		this.bodytemp=bodytemp;
	}
	
	public void getfurr(){
		System.out.println("Has furr on it's "+furr+" body");
	}
	
	public void setfurr(float furr){
		this.furr=furr;
	}

}
