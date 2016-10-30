package models.animals;

import java.util.Calendar;

public class Crocodile  extends Reptile{
	public Crocodile(){
		super(5.2 , 0.55);
		setNrOfLegs(4);
		setName("Crocodile");
		setLaysEggs(true);
	}
	public Crocodile(Integer nrOfLegs , String name , boolean laysEggs){
		super(6.1 , 0.42);
		setNrOfLegs(nrOfLegs);
		setName(name);
		setLaysEggs(laysEggs);
	}
	public double getPredisposition(){
		Calendar date = Calendar.getInstance();
		if (date.get(Calendar.MONTH)>=Calendar.JUNE && date.get(Calendar.MONTH)<=Calendar.AUGUST)
			return 0.2;
		return 0;
	}
	
}
