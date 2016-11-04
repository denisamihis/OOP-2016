package models.animlas;

public class Dove extends Bird{
	
	public Dove( String name){
		super(false,(float)1800 , name, 2,2.4,0.1);
	}
	public Dove ( ){
		super(false,(float)1800 , "Unknown", 2,2.4,0.1);
	}
}
