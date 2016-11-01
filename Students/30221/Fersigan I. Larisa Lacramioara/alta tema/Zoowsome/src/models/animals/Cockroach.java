package models.animals;

public class Cockroach extends Insect {

	public Cockroach(){
		super(0,0.1);
		setNrOfLegs(2);
		setName("fluture");
		setCanFly(false);
		setDangerous(true);
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
