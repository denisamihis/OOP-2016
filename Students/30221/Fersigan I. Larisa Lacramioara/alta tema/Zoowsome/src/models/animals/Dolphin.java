package models.animals;

public class Dolphin extends Aquatic{
	
	public WaterType type;
	
	public Dolphin(	WaterType type){
		super(4,0.0);
		setNrOfLegs(0);
		setName("Delfi");
		setAvgSwimDepth(564);
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
