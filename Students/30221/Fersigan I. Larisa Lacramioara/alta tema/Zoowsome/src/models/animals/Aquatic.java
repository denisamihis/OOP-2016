package models.animals;

public abstract class Aquatic extends Animal{
	public Aquatic(double mc, double dp) {
		super(mc, dp);
		// TODO Auto-generated constructor stub
	}
	public int avgSwimDepth;	//Average swim depth
	public enum waterType{			
		saltwater, freshwater;
	}
	public int getAvgSwimDepth() {
		return avgSwimDepth;
	}
	public void setAvgSwimDepth(int avgSwimDepth) {
		this.avgSwimDepth = avgSwimDepth;
	}
	}
		
		


