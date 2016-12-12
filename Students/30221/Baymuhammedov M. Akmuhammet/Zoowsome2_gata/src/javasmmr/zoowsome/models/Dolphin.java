package javasmmr.zoowsome.models;

public class Dolphin extends Aquatic{
	public Dolphin(){
		super(0.5,0.0);
		setnrlegs(0);
		setname("Dolphin");
		setdangerous(Boolean.FALSE);
		setswimdepth(1000);
		setTakencareof(Boolean.FALSE);
	}
	public Dolphin(int nrlegs, String name, Boolean dangerous, int swimdepth,double maintenance, double danger,boolean Takencareof){
		super(maintenance,danger);
		setnrlegs(nrlegs);
		setname(name);
		setdangerous(dangerous);
		setswimdepth(swimdepth);
		setTakencareof(Takencareof);
	}

}
