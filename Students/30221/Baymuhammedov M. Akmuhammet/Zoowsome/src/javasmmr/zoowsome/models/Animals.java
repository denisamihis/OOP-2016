package javasmmr.zoowsome.models;

public abstract class Animals {
	private int nrlegs;
	private String name;
	
	public void getNrlegs(){
		System.out.println("Has number of legs: "+nrlegs);
	}
	
	public void setnrlegs(int nrlegs){
		this.nrlegs=nrlegs;
	}
	
	public void getName(){
		System.out.println("Name: "+name);
	}
	
	public void setname(String name){
		this.name=name;
	}

}
