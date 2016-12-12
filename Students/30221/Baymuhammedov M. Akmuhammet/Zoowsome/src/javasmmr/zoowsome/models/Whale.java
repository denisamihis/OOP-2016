package javasmmr.zoowsome.models;

public class Whale extends Aquatic{
	public Whale(){
		setnrlegs(0);
		setname("Whale");
		setdangerous(Boolean.FALSE);
		setswimdepth(1000);
	}
	public Whale(int nrlegs, String name, Boolean dangerous, int swimdepth){
		setnrlegs(nrlegs);
		setname(name);
		setdangerous(dangerous);
		setswimdepth(swimdepth);
	}

}
