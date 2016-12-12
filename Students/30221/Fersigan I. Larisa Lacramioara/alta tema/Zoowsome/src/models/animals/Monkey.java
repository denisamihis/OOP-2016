package models.animals;

public class Monkey extends Mammal {
	
	
	public Monkey(){
		super(3,0.2);
		setNormalBodyTemp(39);
		setPercBodyHair(99);
		setNrOfLegs(4);
		setName("Orlando");
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
