package models.animals;

public class Squid extends Aquatic{
public WaterType type;
	
	public Squid( WaterType type){
		super(2,0.3);
		setNrOfLegs(0);
		setName("name");
		setAvgSwimDepth(764);
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
