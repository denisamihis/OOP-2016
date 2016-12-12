package javasmmr.zoowsome.models;

public class Dolphin extends Aquatic{
	public Dolphin(){
		setnrlegs(0);
		setname("Dolphin");
		setdangerous(Boolean.FALSE);
		setswimdepth(1000);
	}
	public Dolphin(int nrlegs, String name, Boolean dangerous, int swimdepth){
		setnrlegs(nrlegs);
		setname(name);
		setdangerous(dangerous);
		setswimdepth(swimdepth);
	}

}
