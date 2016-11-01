package models.animals;

public class Tiger extends Mammal{


	
	public Tiger(){
		super(3,0.9);
		setNormalBodyTemp(37);
		setPercBodyHair(89);
		setNrOfLegs(4);
		setName("pisi");
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
