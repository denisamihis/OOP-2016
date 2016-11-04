package javasmmr.zoowsome.models;

public class Shark extends Aquatic{
     public Shark(){
    	 super(0.6,1.0);
    	 setnrlegs(0);
    	 setname("Shark");
    	 setdangerous(Boolean.TRUE);
    	 setswimdepth(1000);
     }
     
     public Shark(int nrlegs, String name, Boolean dangerous, int swimdepth, double maintenance, double danger){
    	 super(maintenance, danger);
    	 setnrlegs(nrlegs);
    	 setname(name);
    	 setdangerous(dangerous);
    	 setswimdepth(swimdepth);
     }
}
