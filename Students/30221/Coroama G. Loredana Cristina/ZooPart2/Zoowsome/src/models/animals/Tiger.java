package models.animals;

public class Tiger extends Mammal{
public 	Tiger() {
		super(2,0.8);
		setNormalBodyTemp(2);
		setPercBodyHair(5);
	}


	


	@Override
	public boolean kill() {
		double d=Math.random();
		if(d<dangerPerc)
			return true;
		return false;
	}
	
	
}
