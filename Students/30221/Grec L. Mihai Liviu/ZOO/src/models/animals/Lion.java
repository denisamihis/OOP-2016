package models.animals;

import java.util.Calendar;

public class Lion extends Mammal{
	public Lion(){
		super(5.3 , 0.54);
		setNrOfLegs(4);
		setName("Lion");
		setNormalBodyTemp(38.5);
		setPercBodyHair(0.4);
	}
	public Lion(Integer nrOfLegs , String name , double normalBodyTemp , double percBodyHair){
			super(6.8 , 0.46);
			setNrOfLegs(nrOfLegs);
			setName(name);
			setNormalBodyTemp(normalBodyTemp);
			setPercBodyHair(percBodyHair);
	}
	public double getPredisposition(){
			Calendar date = Calendar.getInstance();
			if (date.get(Calendar.HOUR_OF_DAY)>=9 && date.get(Calendar.HOUR_OF_DAY)<=12)
				return 0.3;
			return 0;
	}
}

