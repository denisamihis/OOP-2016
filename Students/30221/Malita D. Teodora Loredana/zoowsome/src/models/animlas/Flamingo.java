package models.animlas;

public class Flamingo extends Bird {
	public Flamingo( String name, int age){
		super(true,(float)1800 ,"Phoenicopterus", name, age);
	}
	public Flamingo ( ){
		super(false,(float)1800 ," Phoenicopterus", "Unknown", 0);
	}

}
