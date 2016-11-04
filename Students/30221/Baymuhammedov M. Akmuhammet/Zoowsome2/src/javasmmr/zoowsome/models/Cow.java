package javasmmr.zoowsome.models;

public class Cow extends Mammals {
    public Cow(){
    	super(0.7,0.3);
    	setnrlegs(4);
    	setname("Cow");
    	setbodytemp(100);
    	setfurr(100);
    }
    public Cow(int nrlegs, String name, int bodytemp, float furr,double maintenance, double danger){
    	super(maintenance, danger);
    	setnrlegs(nrlegs);
    	setname(name);
    	setbodytemp(bodytemp);
    	setfurr(furr);
    }
}
