package javasmmr.zoowsome.models;

public class Cow extends Mammals {
    public Cow(){
    	setnrlegs(4);
    	setname("Cow");
    	setbodytemp(100);
    	setfurr(100);
    }
    public Cow(int nrlegs, String name, int bodytemp, float furr){
    	setnrlegs(nrlegs);
    	setname(name);
    	setbodytemp(bodytemp);
    	setfurr(furr);
    }
}
