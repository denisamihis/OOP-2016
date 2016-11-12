package javasmmr.zoowsome.models;

public abstract class Insects extends Animals {
	private Boolean venomous;
	private Boolean canfly;
	
	public Insects(Double maintenance, Double danger){
		super(maintenance, danger);
	}
	
	public void venomous(){
		System.out.println("Venomous: "+venomous);
	}
	
	public void setvenomous(Boolean venom){
		this.venomous=venom;
	}
	
	public void canfly(){
		System.out.println("Canfly: "+canfly);
	}
	
	public void setcanfly(Boolean fly){
		this.canfly=fly;
	}

}
