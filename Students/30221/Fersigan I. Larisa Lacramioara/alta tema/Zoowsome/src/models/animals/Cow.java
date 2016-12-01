package models.animals;

public class Cow extends Mammal {
	
	
	
	public Cow(){
		super(3,0.0);
		setNrOfLegs(4);
		setPercBodyHair(78);
		setNormalBodyTemp(37);
		setName("vaca");
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
