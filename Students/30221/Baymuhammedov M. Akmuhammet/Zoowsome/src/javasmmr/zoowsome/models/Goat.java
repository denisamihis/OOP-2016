package javasmmr.zoowsome.models;

public class Goat extends Mammals{
	public Goat(){
	setnrlegs(4);
	setname("Goat");
	setbodytemp(120);
	setfurr(100);
	}
	
	public Goat(int nrlegs, String name, int bodytemp, float furr){
		setnrlegs(nrlegs);
		setname(name);
		setbodytemp(bodytemp);
		setfurr(furr);
	}
}
