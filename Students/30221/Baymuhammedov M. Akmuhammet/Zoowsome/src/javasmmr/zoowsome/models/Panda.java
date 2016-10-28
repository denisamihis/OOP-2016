package javasmmr.zoowsome.models;

public class Panda extends Mammals{
	public Panda(){
		setnrlegs(4);
		setname("Panda");
		setbodytemp(140);
		setfurr(100);
	}
	public Panda(int nrlegs, String name, int bodytemp, int furr){
		setnrlegs(nrlegs);
		setname(name);
		setbodytemp(bodytemp);
		setfurr(furr);
	}
}
