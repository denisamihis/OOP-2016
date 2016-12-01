package models.animals;

public class Butterfly extends Insect {
	
	
	public Butterfly(){
		super(0,0.0);
		setNrOfLegs(2);
		setName("fluture");
		setCanFly(true);
		setDangerous(false);
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
