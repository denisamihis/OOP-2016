package javasmmr.zoowsome.models.animals;
import java.util.*;
public class Cockroach extends Insects {
   public Cockroach(){
	   super(false,true,6,"Cockroach",5.2,0.8);
   }
   
   // astia is periculosi iarna cand ii frigutz afara
   @Override
   public double getPredisposition(){
	   Calendar date= Calendar.getInstance();
	   if(date.get(Calendar.MONTH)>=Calendar.DECEMBER && date.get(Calendar.MONTH)<=Calendar.FEBRUARY)
		   return 0.15;
	   return 0;
				   
   }
}
