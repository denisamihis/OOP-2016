package javasmmr.zoowsome.models.employees;

import java.util.concurrent.ThreadLocalRandom;

public class Id {
	private static long []sir = new long[1000];
	private static int counter;
	
	public static long getId(){
    	  long newId = ThreadLocalRandom.current().nextLong(1000000000000L , 9999999999999L);
          while(!isUnique(newId))
        	  newId=ThreadLocalRandom.current().nextLong(1000000000000L , 9999999999999L);
          sir[counter++]= newId;
          return newId;
    	  
      }
	
	
	public static boolean isUnique(long a){
		for(int i=0;i<counter;i++)
			if(sir[i]==a) 
				return false;
		return true;
	}
}
