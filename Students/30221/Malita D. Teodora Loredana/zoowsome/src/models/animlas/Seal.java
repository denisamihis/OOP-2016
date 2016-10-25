package models.animlas;


public class Seal extends Aquatic {
	public Seal (String name){
		super(-20,wT.saltWater, name, 2);
	}
	public Seal (){
		super(-20,wT.saltWater, "Unknown", 2);
	}

}
