package javasmmr.zoowsome.models.animals;

import java.util.Calendar;

public class Whale extends Aquatic{
	public Whale(){
		super(1000,0,"Balena",5.0,0.4);
	    setWater(Water.Saltwater);
	       
	}
	//DUMINICA PANA LA 18
	@Override
	  public double getPredisposition(){
	  Calendar date = Calendar.getInstance();
	      if (date.get(Calendar.DAY_OF_WEEK)==Calendar.SUNDAY && date.get(Calendar.HOUR_OF_DAY) <=18)
	    	  return 0.55;
	      return 0;
	  }

}
