package models.animals;

import java.util.Calendar;

public class Snake extends Reptile{
	public Snake(){
		super(2.4 , 0.47);
		setNrOfLegs(0);
		setName("Snake");
		setLaysEggs(true);
	}
	public Snake(Integer nrOfLegs , String name , boolean laysEggs){
		super(2.4 , 0.39);
		setNrOfLegs(nrOfLegs);
		setName(name);
		setLaysEggs(laysEggs);
	}
	public double getPredisposition(){
		Calendar date = Calendar.getInstance();
		if (date.get(Calendar.HOUR_OF_DAY)>=18 && date.get(Calendar.HOUR_OF_DAY)<=6)
			return 0.35;
		return 0;
	}
}
