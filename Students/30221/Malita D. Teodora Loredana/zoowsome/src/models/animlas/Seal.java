package models.animlas;

public class Seal extends Aquatic  {
	public Seal (String name){
		super(-20,wT.saltWater, name, 2,7.5,0.17);
	}
	public Seal (){
		super(-20,wT.saltWater, "Unknown", 2,7.5,0.17);
	}
}
