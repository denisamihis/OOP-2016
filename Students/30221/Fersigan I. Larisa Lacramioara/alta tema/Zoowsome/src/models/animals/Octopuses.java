package models.animals;

public class Octopuses extends Aquatic {
	 
public WaterType type;
	
	public Octopuses( WaterType type){
		super(1,0.5);
		setNrOfLegs(0);
		setName("Octi");
		setAvgSwimDepth(845);
		this.type= type;
	}
	@Override
	public boolean kill() {
		// TODO Auto-generated method stub
		double d=Math.random();
		if(d<dangerPerc)
			return true;
		return false;
	}
}
