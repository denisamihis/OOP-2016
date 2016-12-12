package javasmmr.zoowsome.models.animals;

import java.util.Calendar;

public class Woodpecker extends Bird{
   public Woodpecker(){
	   super(true,60,2,"ciocanitoare",5.5,0.25);
       
   }
   
   @Override
	  public double getPredisposition(){
	  Calendar date = Calendar.getInstance();
	      if (date.get(Calendar.DAY_OF_WEEK)==Calendar.THURSDAY && (date.get(Calendar.MONTH)>=Calendar.MARCH && date.get(Calendar.MONTH)<=Calendar.OCTOBER))
	    	  return 0.05;
	      return 0;
	  }
}
