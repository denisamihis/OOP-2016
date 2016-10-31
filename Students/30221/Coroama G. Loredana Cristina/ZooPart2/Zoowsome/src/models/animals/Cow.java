package models.animals;

public class Cow extends Mammal {

	public Cow() {
		 super(3,0.1);
			setNormalBodyTemp(2);
			setPercBodyHair(5);
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
