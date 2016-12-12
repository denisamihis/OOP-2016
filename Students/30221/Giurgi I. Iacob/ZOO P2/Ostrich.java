package javasmmr.zoowsome.models.animals;

import java.util.Calendar;

public class Ostrich extends Bird{
   public Ostrich(){
	   super(false,0,2,"Strutz",5.0,0.74);
   }
   // Te calca in picioare de il scoli pre dimineata
   @Override
   public double getPredisposition(){
	   Calendar date = Calendar.getInstance();
	      if (date.get(Calendar.HOUR_OF_DAY)>=06 && date.get(Calendar.HOUR_OF_DAY) <=10)
	    	  return 0.3;
	      return 0;

   }
   
}
