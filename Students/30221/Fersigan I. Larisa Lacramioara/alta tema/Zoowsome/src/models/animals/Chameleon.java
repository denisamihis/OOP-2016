package models.animals;

public class Chameleon extends Reptile{

	
	public Chameleon(){
		super(3,0.2);
		setNrOfLegs(2);
		setName("cami");
		setLaysEggs(true);
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
