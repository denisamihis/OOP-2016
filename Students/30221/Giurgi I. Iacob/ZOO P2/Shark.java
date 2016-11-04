package javasmmr.zoowsome.models.animals;
import java.util.*;
public class Shark extends Aquatic{
  public Shark(){
	  super(7550,0,"Rechin",5.0,0.95);
	  setWater(Water.Saltwater);
  }
  
  // Ii nebun cand i se face foame
  @Override
  public double getPredisposition(){
  Calendar date = Calendar.getInstance();
      if (date.get(Calendar.HOUR_OF_DAY)>=12 && date.get(Calendar.HOUR_OF_DAY) <=18)
    	  return 0.5;
      return 0;
  }
}
