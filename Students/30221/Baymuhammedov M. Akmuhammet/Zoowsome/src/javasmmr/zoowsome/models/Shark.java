package javasmmr.zoowsome.models;

public class Shark extends Aquatic{
     public Shark(){
    	 setnrlegs(0);
    	 setname("Shark");
    	 setdangerous(Boolean.TRUE);
    	 setswimdepth(1000);
     }
     
     public Shark(int nrlegs, String name, Boolean dangerous, int swimdepth){
    	 setnrlegs(nrlegs);
    	 setname(name);
    	 setdangerous(dangerous);
    	 setswimdepth(swimdepth);
     }
}
