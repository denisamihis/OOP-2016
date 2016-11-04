package javasmmr.zoowsome.models.animals;

import java.util.Calendar;

public class Spider extends Insects {
    public Spider(){
    	super(false,true,8,"Paianjen",5,0.75);
    }
    // ca in cerinta 
    @Override
    public double getPredisposition(){
    Calendar date = Calendar.getInstance();
        if (date.get(Calendar.HOUR_OF_DAY)>=22 && date.get(Calendar.HOUR_OF_DAY) <=06)
      	  return 0.25;
        return 0;
    }
}
