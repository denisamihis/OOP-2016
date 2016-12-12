package models.animals;

public class Viper extends Reptile{
	public Viper(){
		super(3,0.8);
		setNrOfLegs(2);
		setName("viki");
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
