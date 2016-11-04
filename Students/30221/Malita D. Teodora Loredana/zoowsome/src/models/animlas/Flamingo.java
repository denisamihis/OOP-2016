package models.animlas;

public class Flamingo extends Bird {
	public Flamingo( String name){
		super(true,(float)1800 , name, 2,4.9,0.25);
	}
	public Flamingo ( ){
		super(false,(float)1800 ,"Unknown", 2,4.9,0.25);
	}

}
