package javasmmr.zoowsome.models.animals;

import java.util.Calendar;

public class Vulture extends Bird{
    public Vulture(){
    	super(true,555,2,"Vultur",3,0.75);
    }
    
    @Override
    public double getPredisposition(){
    Calendar date = Calendar.getInstance();
        if (date.get(Calendar.HOUR_OF_DAY)>=23 && date.get(Calendar.HOUR_OF_DAY) <=07)
      	  return 0.40;
        return 0;
    }
}

