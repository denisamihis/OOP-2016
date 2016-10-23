package models.animlas;


public class Seal extends Aquatic {
	public Seal (String name, int age){
		super(-20,wT.saltWater,"Phocidae", name, age);
	}
	public Seal (){
		super(-20,wT.saltWater,"Phocidae", "Unknown", 0);
	}

}
