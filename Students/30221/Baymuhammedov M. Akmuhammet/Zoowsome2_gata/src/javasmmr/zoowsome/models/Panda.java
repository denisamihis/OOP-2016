package javasmmr.zoowsome.models;

public class Panda extends Mammals{
	public Panda(){
		super(0.6,0.4);
		setnrlegs(4);
		setname("Panda");
		setbodytemp(140);
		setfurr(100);
		setTakencareof(Boolean.FALSE);
	}
	public Panda(int nrlegs, String name, int bodytemp, int furr,double maintenance,double danger,boolean Takencareof){
		super(maintenance, danger);
		setnrlegs(nrlegs);
		setname(name);
		setbodytemp(bodytemp);
		setfurr(furr);
		setTakencareof(Takencareof);
	}
}
