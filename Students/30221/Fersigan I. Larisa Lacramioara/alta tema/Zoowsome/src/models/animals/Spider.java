package models.animals;

public class Spider extends Insect{

	public Spider(){
		super(1,0.3);
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
