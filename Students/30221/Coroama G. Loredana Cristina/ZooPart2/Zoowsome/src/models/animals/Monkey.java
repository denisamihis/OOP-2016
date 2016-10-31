package models.animals;

public class Monkey extends Mammal {
	public	Monkey() {
		super(3,0.2);
	
		setNormalBodyTemp(55);
		setPercBodyHair(57);
	}


	
		
	
	
	


	@Override
	public boolean kill() {
		double d=Math.random();
		if(d<dangerPerc)
			return true;
		return false;
	}
	
	
}


