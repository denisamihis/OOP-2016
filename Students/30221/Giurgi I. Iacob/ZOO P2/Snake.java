package javasmmr.zoowsome.models.animals;

import java.util.Calendar;

public class Snake extends Reptiles{
   public Snake(){
	   super(true,0,"Sarpe",2.0,1);
   }
   
   // Trebe sa fie alimentat inainte si chiar dupa weekend 
   @Override
   public double getPredisposition(){
   Calendar date = Calendar.getInstance();
     if (date.get(Calendar.DAY_OF_WEEK) == Calendar.MONDAY || date.get(Calendar.DAY_OF_WEEK) == Calendar.FRIDAY)
    	    return 0.66;
       return 0;
   }
}
