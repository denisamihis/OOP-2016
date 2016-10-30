package models.animals;

import java.util.Calendar;

public class Kangaroo extends Mammal{
	public Kangaroo(){
		super(4.8 , 0.22);
		setNrOfLegs(4);
		setName("Kangaroo");
		setNormalBodyTemp(36);
		setPercBodyHair(0.1);
	}
	public Kangaroo(Integer nrOfLegs , String name , double normalBodyTemp , double percBodyHair){
		super(4.8 , 0.22);
		setNrOfLegs(nrOfLegs);
		setName(name);
		setNormalBodyTemp(normalBodyTemp);
		setPercBodyHair(percBodyHair);
	}
	public double getPredisposition(){
		Calendar date = Calendar.getInstance();
		if (date.get(Calendar.MONTH) == Calendar.JANUARY || (date.get(Calendar.HOUR_OF_DAY)>=11 && date.get(Calendar.HOUR_OF_DAY)<=17))
			return 0.12;
		return 0;
	}
	
}
